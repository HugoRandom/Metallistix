package com.hugorandom.metallistix.blocks.metals;

import com.hugorandom.metallistix.blocks.MetalBlock;
import com.hugorandom.metallistix.foods.FoodsInit;
import com.hugorandom.metallistix.particles.ParticlesInit;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

import java.util.Collection;
import java.util.Random;

public class FranitolinaBlock extends MetalBlock {

    public FranitolinaBlock(float strength, float explosion) {
        super(strength, explosion);
    }

    @Override
    public void animateTick(BlockState pState, Level pLevel, BlockPos pos, Random rand) {
        super.animateTick(pState, pLevel, pos, rand);
        if (rand.nextInt(12) == 0) {
            pLevel.addParticle(ParticlesInit.FRANITOLINA_PARTICLE.get(),
                    (double)pos.getX() + rand.nextDouble(),
                    (double)pos.getY() + 1.1D,
                    (double)pos.getZ() + rand.nextDouble(),
                    0.0D, 0.0D, 0.0D);
        }
    }

    @Override
    public InteractionResult use(BlockState pState, Level worldIn, BlockPos pos, Player player,
                                 InteractionHand pHand, BlockHitResult pHit) {
        if(!worldIn.isClientSide) {
            if (player.getMainHandItem().getItem() == FoodsInit.FRAOPU.get()) {
                worldIn.playSound(null, pos, SoundEvents.SWEET_BERRY_BUSH_PICK_BERRIES,
                        SoundSource.BLOCKS.BLOCKS, 0.6f, 1f);
                Collection<MobEffectInstance> effects = player.getActiveEffects();
                if (effects.size() == 0) {
                    player.addEffect(new MobEffectInstance(MobEffects.LUCK, 1200, 0));
                }
                else {
                    for (MobEffectInstance effect : effects) {
                        if(effect.getEffect() == MobEffects.LUCK) {
                            player.addEffect(new MobEffectInstance(MobEffects.LUCK,
                                    effect.getDuration() + 600, effect.getAmplifier()));
                        }
                        else {
                            player.addEffect(new MobEffectInstance(MobEffects.LUCK, 1200, 0));
                        }
                    }
                }
                int count = player.getMainHandItem().getCount();
                if(count == 1) {
                    player.getMainHandItem().setCount(0);
                }
                else {
                    player.getMainHandItem().setCount(count - 1);
                }
            }
            else {
                worldIn.playSound(null, pos, SoundEvents.METAL_HIT,
                        SoundSource.BLOCKS.BLOCKS, 0.6f, 1f);
            }
        }
        return InteractionResult.SUCCESS;
    }
}
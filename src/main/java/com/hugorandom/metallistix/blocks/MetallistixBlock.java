package com.hugorandom.metallistix.blocks;

import com.hugorandom.metallistix.blocks.entitys.UpgradingEntity;
import com.hugorandom.metallistix.world.dimensions.DimensionsInit;
import com.hugorandom.metallistix.items.Items1Init;
import com.hugorandom.metallistix.particles.ParticlesInit;
import com.hugorandom.metallistix.util.ModTags;
import com.hugorandom.metallistix.foods.FoodsInit;
import com.hugorandom.metallistix.effects.EffectsInit;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.network.NetworkHooks;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class MetallistixBlock extends BaseEntityBlock {

    public static final BooleanProperty ENERGY = BooleanProperty.create("energy");

    public MetallistixBlock() {
        super(Properties
                .of(Material.METAL)
                .sound(SoundType.SHROOMLIGHT)
                .requiresCorrectToolForDrops()
                .strength(8.0f, 45.0f)
                .lightLevel((state) -> state.getValue(MetallistixBlock.ENERGY) ? 15 : 7));
        this.registerDefaultState(this.defaultBlockState().setValue(ENERGY, Boolean.valueOf(false)));
    }

    @Override
    public RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(ENERGY);
    }

    @Override
    public void onRemove(BlockState pState, Level pLevel, BlockPos pPos,
                         BlockState pNewState, boolean pIsMoving) {
        if (pState.getBlock() != pNewState.getBlock()){
            BlockEntity blockEntity = pLevel.getBlockEntity(pPos);
            if (blockEntity instanceof UpgradingEntity){
                ((UpgradingEntity) blockEntity).drops();
            }
        }
        super.onRemove(pState, pLevel, pPos, pNewState, pIsMoving);
    }

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer,
                                 InteractionHand pHand, BlockHitResult pHit) {
        if(!pLevel.isClientSide()){
            if (pHand == InteractionHand.MAIN_HAND){
                if (pPlayer.getItemInHand(pHand).is(Items.AIR)){
                    BlockEntity entity = pLevel.getBlockEntity(pPos);
                    if (entity instanceof UpgradingEntity){
                        NetworkHooks.openGui(((ServerPlayer) pPlayer), (UpgradingEntity)entity, pPos);
                    }
                    else{
                        throw new IllegalStateException("Pal lobby hermano, CAGASTE.");
                    }
                } else if (pPlayer.getItemInHand(pHand).is(FoodsInit.LISTIX_PILL.get())) {
                    pPlayer.getItemInHand(pHand).shrink(1);
                    pLevel.playSound(null, pPos, SoundEvents.ITEM_FRAME_REMOVE_ITEM,
                            SoundSource.BLOCKS, 0.8F, 0.9F);
                    if (pPlayer.getLevel().dimension() == DimensionsInit.MAPASHE_DIM_KEY){
                        pLevel.addFreshEntity(new ItemEntity(pLevel, pPos.getX()+0.5,
                                pPos.getY()+1, pPos.getZ()+0.5,
                                new ItemStack(Items1Init.HALIX_INGOT.get())));
                    }
                    else{
                        pLevel.addFreshEntity(new ItemEntity(pLevel, pPos.getX()+0.5,
                                pPos.getY()+1, pPos.getZ()+0.5,
                                    new ItemStack(FoodsInit.LISTIX_PILL.get())));
                        if (!pState.getValue(ENERGY)){
                            pPlayer.addEffect(new MobEffectInstance(EffectsInit.UNSTABLE.get(),
                                    100, 0));
                        }
                    }
                }
            }
        }
        return InteractionResult.sidedSuccess(pLevel.isClientSide);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new UpgradingEntity(pPos, pState);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level pLevel,
                                                                  BlockState pState,
                                                                  BlockEntityType<T> pBlockEntityType) {
        return createTickerHelper(pBlockEntityType,
                BlocksEntitiesInit.METALLISTIX_BLOCK_ENTITY.get(), UpgradingEntity::tick);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void animateTick(@NotNull BlockState pState, @NotNull Level pLevel,
                            @NotNull BlockPos pPos, Random rand) {
        if (rand.nextInt(10) == 0) {
            pLevel.addParticle(ParticlesInit.METALLISTIX_PARTICLE.get(),
                    (double)pPos.getX() + rand.nextDouble(),
                    (double)pPos.getY() + 1.1D,
                    (double)pPos.getZ() + rand.nextDouble(),
                    0.0D, 0.0D, 0.0D);
        }
        super.animateTick(pState, pLevel, pPos, rand);
    }

    @Override
    public void neighborChanged(@NotNull BlockState pState, Level pLevel, BlockPos pPos,
                                @NotNull Block pBlock, @NotNull BlockPos pFromPos, boolean pIsMoving) {
        if (isEnergyBlock(pLevel.getBlockState(pPos.above()))) {
            if (!pState.getValue(ENERGY)) {
                pLevel.setBlock(pPos, pState.setValue(ENERGY, Boolean.TRUE), 3);
            }
        }
        else{
            pLevel.setBlock(pPos, pState.setValue(ENERGY, Boolean.FALSE), 3);
        }
        super.neighborChanged(pState, pLevel, pPos, pBlock, pFromPos, pIsMoving);
    }

    private static boolean isEnergyBlock(BlockState state) {
        return state.is(ModTags.Blocks.METALLISTIX_BLOCKS);
    }
}

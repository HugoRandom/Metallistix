package com.hugorandom.metallistix.blocks.metals;

import com.hugorandom.metallistix.blocks.MetalBlock;
import com.hugorandom.metallistix.particles.ParticlesInit;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Random;

public class MiguelitioBlock extends MetalBlock {

    public MiguelitioBlock(float strength, float explosion) {
        super(strength, explosion);
    }

    @Override
    public void animateTick(BlockState pState, Level pLevel, BlockPos pos, Random rand) {
        super.animateTick(pState, pLevel, pos, rand);
        if (rand.nextInt(12) == 0) {
            pLevel.addParticle(ParticlesInit.MIGUELITIO_PARTICLE.get(),
                    (double)pos.getX() + rand.nextDouble(),
                    (double)pos.getY() + 1.1D,
                    (double)pos.getZ() + rand.nextDouble(),
                    0.0D, 0.0D, 0.0D);
        }
    }
}
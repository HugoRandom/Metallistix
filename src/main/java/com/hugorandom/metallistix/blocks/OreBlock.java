package com.hugorandom.metallistix.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class OreBlock extends Block {

    public OreBlock(float strength, float explosion) {
        super(Properties
                .of(Material.STONE)
                .sound(SoundType.STONE)
                .requiresCorrectToolForDrops()
                .strength(strength, explosion));
    }
}
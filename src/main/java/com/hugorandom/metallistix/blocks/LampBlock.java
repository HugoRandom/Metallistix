package com.hugorandom.metallistix.blocks;

import net.minecraft.world.level.block.RedstoneLampBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class LampBlock extends RedstoneLampBlock {

    public LampBlock() {
        super(Properties
                .of(Material.BUILDABLE_GLASS)
                .sound(SoundType.GLASS)
                .strength(2.0f, 4.0f)
                .lightLevel((state) -> state.getValue(LampBlock.LIT) ? 15 : 0));
    }
}
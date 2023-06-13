package com.hugorandom.metallistix.util;

import com.hugorandom.metallistix.blocks.BlocksInit;
import com.hugorandom.metallistix.foods.FoodsInit;
import com.hugorandom.metallistix.items.Items1Init;
import com.hugorandom.metallistix.items.Items2Init;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class ItemGroupTabs {
        public static final CreativeModeTab METALLISTIX_ITEMS =
                new CreativeModeTab("metallistix_tab_items"){
            @Override
            public @NotNull ItemStack makeIcon() {
                return new ItemStack(Items2Init.METALLISTIX_AMULET.get());
            }
        };

        public static final CreativeModeTab METALLISTIX_FOODS =
                new CreativeModeTab("metallistix_tab_foods"){
            @Override
            public @NotNull ItemStack makeIcon() {
                return new ItemStack(Items1Init.HALIX_INGOT.get());
            }
        };

        public static final CreativeModeTab METALLISTIX_BLOCKS =
                new CreativeModeTab("metallistix_tab_blocks"){
            @Override
            public @NotNull ItemStack makeIcon() {
                return new ItemStack(BlocksInit.METALLISTIX_BLOCK.get());
            }
        };

        public static final CreativeModeTab METALLISTIX_TOOLS =
                new CreativeModeTab("metallistix_tab_tools"){
            @Override
            public @NotNull ItemStack makeIcon() {
                return new ItemStack(FoodsInit.LISTIX_PILL.get());
            }
        };
}

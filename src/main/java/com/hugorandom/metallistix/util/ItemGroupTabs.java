package com.hugorandom.metallistix.util;

import com.hugorandom.metallistix.items.Items1Init;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ItemGroupTabs {
        public static final CreativeModeTab METALLISTIX_ITEMS = new CreativeModeTab("metallistix_tab_items"){
            @Override
            public ItemStack makeIcon() {
                return new ItemStack(Items1Init.DISPROSIO_INGOT.get());
            }
        };

        public static final CreativeModeTab METALLISTIX_FOODS = new CreativeModeTab("metallistix_tab_foods"){
            @Override
            public ItemStack makeIcon() {
                return new ItemStack(Items1Init.DISPROSIO_INGOT.get());
            }
        };

        public static final CreativeModeTab METALLISTIX_BLOCKS = new CreativeModeTab("metallistix_tab_blocks"){
            @Override
            public ItemStack makeIcon() {
                return new ItemStack(Items1Init.DISPROSIO_INGOT.get());
            }
        };

        public static final CreativeModeTab METALLISTIX_TOOLS = new CreativeModeTab("metallistix_tab_tools"){
            @Override
            public ItemStack makeIcon() {

                return new ItemStack(Items1Init.DISPROSIO_INGOT.get());
            }
        };
}

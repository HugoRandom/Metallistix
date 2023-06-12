package com.hugorandom.metallistix.items;

import com.hugorandom.metallistix.util.ItemGroupTabs;
import net.minecraft.world.item.Rarity;

public class CommonItem extends net.minecraft.world.item.Item {

    public CommonItem() {
        super(new Properties()
                .tab(ItemGroupTabs.METALLISTIX_ITEMS)
                .rarity(Rarity.COMMON)
                .stacksTo(64)
                .setNoRepair());
    }
}
package com.hugorandom.metallistix.tools;

import com.hugorandom.metallistix.util.ItemGroupTabs;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Tier;

public class Hoe extends HoeItem {

    public Hoe(Tier pTier) {
        super(pTier, 0, 0f,
                new Properties()
                        .tab(ItemGroupTabs.METALLISTIX_TOOLS)
                        .stacksTo(1)
                        .rarity(Rarity.COMMON));
    }
}
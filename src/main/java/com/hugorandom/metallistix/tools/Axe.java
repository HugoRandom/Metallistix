package com.hugorandom.metallistix.tools;

import com.hugorandom.metallistix.util.ItemGroupTabs;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Tier;

public class Axe extends AxeItem {

    public Axe(Tier pTier) {
        super(pTier, 4, -3f,
                new Properties()
                        .tab(ItemGroupTabs.METALLISTIX_TOOLS)
                        .stacksTo(1)
                        .rarity(Rarity.COMMON));
    }
}
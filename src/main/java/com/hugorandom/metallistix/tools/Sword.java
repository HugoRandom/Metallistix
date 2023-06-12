package com.hugorandom.metallistix.tools;

import com.hugorandom.metallistix.util.ItemGroupTabs;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class Sword extends SwordItem {

    public Sword(Tier pTier) {
        super(pTier, 2, -2.4f,
                new Properties()
                        .tab(ItemGroupTabs.METALLISTIX_TOOLS)
                        .stacksTo(1)
                        .rarity(Rarity.COMMON));
    }
}

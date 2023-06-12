package com.hugorandom.metallistix.tools;

import com.hugorandom.metallistix.util.ItemGroupTabs;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Tier;

public class Pickaxe extends PickaxeItem {

    public Pickaxe(Tier pTier) {
        super(pTier, 1, -2.8f,
                new Properties()
                        .tab(ItemGroupTabs.METALLISTIX_TOOLS)
                        .stacksTo(1)
                        .rarity(Rarity.COMMON));
    }
}

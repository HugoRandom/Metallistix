package com.hugorandom.metallistix.items;

import com.hugorandom.metallistix.util.ItemGroupTabs;
import com.hugorandom.metallistix.sounds.SoundsInit;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class AmuletItem extends Item {

    public AmuletItem() {
        super(new Properties()
                .tab(ItemGroupTabs.METALLISTIX_ITEMS)
                .rarity(Rarity.UNCOMMON)
                .stacksTo(1)
                .setNoRepair()
                .fireResistant());
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents,
                                TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(new TranslatableComponent("tooltip.metallistix.amulet"));
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        if (pContext.getLevel().isClientSide()){
            BlockPos positionClicked = pContext.getClickedPos();
            Player player = pContext.getPlayer();

            pContext.getLevel().playSound(player, positionClicked, SoundsInit.UPGRADING_SOUND.get(),
                    SoundSource.BLOCKS, 1f, 1f);
        }
        return super.useOn(pContext);
    }
}
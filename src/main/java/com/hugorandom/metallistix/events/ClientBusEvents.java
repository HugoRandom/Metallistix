package com.hugorandom.metallistix.events;

import com.hugorandom.metallistix.Metallistix;
import com.hugorandom.metallistix.blocks.BlocksInit;
import com.hugorandom.metallistix.client.TeleporterChargeOverlay;
import com.hugorandom.metallistix.screens.*;
import com.hugorandom.metallistix.util.KeyBindings;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.client.gui.OverlayRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Metallistix.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientBusEvents {

    @SubscribeEvent
    public static void clientSetup(final FMLClientSetupEvent event){
        // Flores - Flowers
        ItemBlockRenderTypes.setRenderLayer(BlocksInit.SOLIMA.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlocksInit.POTTED_SOLIMA.get(), RenderType.cutout());

        // Menu de Mejoras de Armaduras
        MenuScreens.register(MenusInit.UPGRADING_MENU.get(), UpgradingScreen::new);

        // Registro de Tecla
        ClientRegistry.registerKeyBinding(KeyBindings.VITAMINS_KEY);

        // Registro de Overlays
        OverlayRegistry.registerOverlayTop("telecharge", TeleporterChargeOverlay.TELEPORTER_CHARGE_HUD);
    }
}

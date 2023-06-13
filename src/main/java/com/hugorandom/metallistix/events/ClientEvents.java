package com.hugorandom.metallistix.events;

import com.hugorandom.metallistix.Metallistix;
import com.hugorandom.metallistix.network.MetallistixPackets;
import com.hugorandom.metallistix.network.packets.VitaminsC2SPacket;
import com.hugorandom.metallistix.util.KeyBindings;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ClientEvents {
    @Mod.EventBusSubscriber(modid = Metallistix.MOD_ID, value = Dist.CLIENT)
    public static class ClientForgeEvent{
        @SubscribeEvent
        public static void onKeyInput(InputEvent.KeyInputEvent event){
            if(KeyBindings.VITAMINS_KEY.consumeClick()){
                MetallistixPackets.sendToServer(new VitaminsC2SPacket());
            }
        }
    }
}
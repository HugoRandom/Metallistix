package com.hugorandom.metallistix.events;

import com.hugorandom.metallistix.Metallistix;
import com.hugorandom.metallistix.world.gen.OreGen;
import com.hugorandom.metallistix.world.gen.FlowerGen;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Metallistix.MOD_ID)
public class WoldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event){
        OreGen.generateOres(event);
        FlowerGen.generateFlowers(event);
    }
}
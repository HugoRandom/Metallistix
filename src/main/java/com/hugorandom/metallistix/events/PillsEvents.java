package com.hugorandom.metallistix.events;

import com.hugorandom.metallistix.Metallistix;
import com.hugorandom.metallistix.capabilities.vitamins.PlayerVitaminsProvider;
import com.hugorandom.metallistix.util.ModTags;
import com.hugorandom.metallistix.effects.EffectsInit;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(modid = Metallistix.MOD_ID, bus = Bus.FORGE)
public class PillsEvents {

    @SubscribeEvent
    public static void playerConsumePill(LivingEntityUseItemEvent.Finish event) {
        LivingEntity player = event.getEntityLiving();
        if(event.getItem().is(ModTags.Items.METALLISTIX_PILLS_TAG) ||
                event.getItem().is(ModTags.Items.METALLISTIX_PILLS_TAG)) {
            player.getCapability(PlayerVitaminsProvider.PLAYER_VITAMINS).ifPresent(playerVitamins -> {
                playerVitamins.addVitamin(1);
            });
            if (player.hasEffect(EffectsInit.VITAMINIZED.get())){
                int duration = player.getEffect(EffectsInit.VITAMINIZED.get()).getDuration();
                int amplifier = player.getEffect(EffectsInit.VITAMINIZED.get()).getAmplifier();
                player.addEffect(new MobEffectInstance(EffectsInit.VITAMINIZED.get(),
                        duration + 1200, amplifier + 1));
            }
            else {
                player.addEffect(new MobEffectInstance(EffectsInit.VITAMINIZED.get(),1200, 0));
            }
        }
    }
}
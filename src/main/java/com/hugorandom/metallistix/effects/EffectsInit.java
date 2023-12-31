package com.hugorandom.metallistix.effects;

import com.hugorandom.metallistix.Metallistix;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EffectsInit {

    public static final DeferredRegister<MobEffect> MOB_EFFECT =
            DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, Metallistix.MOD_ID);

    public static final RegistryObject<MobEffect> UNSTABLE = MOB_EFFECT.register("unstable",
            () -> new UnstableEffect(MobEffectCategory.HARMFUL, 10167214));
    public static final RegistryObject<MobEffect> VITAMINIZED = MOB_EFFECT.register("vitaminized",
            () -> new VitaminizedEffect(MobEffectCategory.BENEFICIAL, 15167214));

    public static void register(IEventBus eventBus){
        MOB_EFFECT.register(eventBus);
    }
}
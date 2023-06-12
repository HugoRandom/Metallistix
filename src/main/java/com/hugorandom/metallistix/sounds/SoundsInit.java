package com.hugorandom.metallistix.sounds;

import com.hugorandom.metallistix.Metallistix;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SoundsInit {
    public static final DeferredRegister<SoundEvent> SOUNDS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Metallistix.MOD_ID);

    public static void register(IEventBus eventBus){
        SOUNDS.register(eventBus);
    }

    private static RegistryObject<SoundEvent> registerSoundEvent(String name){
        return SOUNDS.register(name, () -> new SoundEvent(new ResourceLocation(Metallistix.MOD_ID, name)));
    }

    // Sonido de Mejoras de Armaduras
    public static final RegistryObject<SoundEvent> UPGRADING_SOUND = registerSoundEvent("upgrading_sound");

    // Discos de Musica
    public static final RegistryObject<SoundEvent> CABALLERITA_DISC = registerSoundEvent("caballerita_disc");
    public static final RegistryObject<SoundEvent> FRANITOLINA_DISC = registerSoundEvent("franitolina_disc");
    public static final RegistryObject<SoundEvent> MELUNA_DISC = registerSoundEvent("meluna_disc");
    public static final RegistryObject<SoundEvent> ALEZARITA_DISC = registerSoundEvent("alezarita_disc");
    public static final RegistryObject<SoundEvent> HUGODIUM_DISC = registerSoundEvent("hugodium_disc");
    public static final RegistryObject<SoundEvent> MIGUELITIO_DISC = registerSoundEvent("miguelitio_disc");
}

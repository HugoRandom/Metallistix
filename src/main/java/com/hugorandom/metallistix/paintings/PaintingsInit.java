package com.hugorandom.metallistix.paintings;

import com.hugorandom.metallistix.Metallistix;
import net.minecraft.world.entity.decoration.Motive;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class PaintingsInit {

    public static final DeferredRegister<Motive> PAINTINGS =
            DeferredRegister.create(ForgeRegistries.PAINTING_TYPES, Metallistix.MOD_ID);

    public static void register(IEventBus eventBus){
        PAINTINGS.register(eventBus);
    }

    public static final RegistryObject<Motive> THE_ROCK =
            PAINTINGS.register("the_rock", () -> new Motive(32, 32));

}
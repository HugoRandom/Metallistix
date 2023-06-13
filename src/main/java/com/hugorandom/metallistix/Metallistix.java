package com.hugorandom.metallistix;
import com.hugorandom.metallistix.effects.EffectsInit;
import com.hugorandom.metallistix.items.Items1Init;
import com.hugorandom.metallistix.blocks.BlocksInit;
import com.hugorandom.metallistix.foods.FoodsInit;
import com.hugorandom.metallistix.items.Items2Init;
import com.hugorandom.metallistix.blocks.BlocksEntitiesInit;
import com.hugorandom.metallistix.network.MetallistixPackets;
import com.hugorandom.metallistix.tools.ToolsInit;
import com.hugorandom.metallistix.armors.ArmorsInit;
import com.hugorandom.metallistix.paintings.PaintingsInit;
import com.hugorandom.metallistix.sounds.SoundsInit;
import com.hugorandom.metallistix.screens.MenusInit;
import com.hugorandom.metallistix.recipes.RecipesInit;
import com.hugorandom.metallistix.particles.ParticlesInit;
import com.hugorandom.metallistix.world.structure.StructuresInit;
import com.hugorandom.metallistix.world.dimensions.DimensionsInit;
import com.hugorandom.metallistix.events.WoldEvents;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Metallistix.MOD_ID)
public class Metallistix
{
    // Directly reference a slf4j logger
    public static final String MOD_ID = "metallistix";
    public static final Logger LOGGER = LogManager.getLogger();

    public Metallistix()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        EffectsInit.register(eventBus);
        Items1Init.register(eventBus);
        BlocksInit.register(eventBus);
        FoodsInit.register(eventBus);
        Items2Init.register(eventBus);
        BlocksEntitiesInit.register(eventBus);
        ToolsInit.register(eventBus);
        ArmorsInit.register(eventBus);
        PaintingsInit.register(eventBus);
        SoundsInit.register(eventBus);
        MenusInit.register(eventBus);
        RecipesInit.register(eventBus);
        ParticlesInit.register(eventBus);
        StructuresInit.register(eventBus);
        DimensionsInit.register();

        eventBus.addListener(this::setup);

        MinecraftForge.EVENT_BUS.register(WoldEvents.class);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        event.enqueueWork(() -> {
            MetallistixPackets.register();
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlocksInit.SOLIMA.getId(), BlocksInit.POTTED_SOLIMA);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlocksInit.FERMIN.getId(), BlocksInit.POTTED_FERMIN);
        });
    }
}

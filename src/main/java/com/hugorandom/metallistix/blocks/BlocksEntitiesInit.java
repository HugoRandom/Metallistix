package com.hugorandom.metallistix.blocks;

import com.hugorandom.metallistix.Metallistix;
import com.hugorandom.metallistix.blocks.entitys.UpgradingEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlocksEntitiesInit {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, Metallistix.MOD_ID);

    public static void register(IEventBus eventBus){
        BLOCK_ENTITIES.register(eventBus);
    }

    public static final RegistryObject<BlockEntityType<UpgradingEntity>> METALLISTIX_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("metallistix_block_entity",
                    () -> BlockEntityType.Builder.of(UpgradingEntity::new,
                            BlocksInit.METALLISTIX_BLOCK.get()).build(null));
}

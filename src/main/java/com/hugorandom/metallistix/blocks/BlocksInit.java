package com.hugorandom.metallistix.blocks;

import com.hugorandom.metallistix.Metallistix;
import com.hugorandom.metallistix.blocks.metals.*;
import com.hugorandom.metallistix.util.ItemGroupTabs;
import com.hugorandom.metallistix.items.Items1Init;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlocksInit {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Metallistix.MOD_ID);
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<T> registerBlockNoItem(String name, Supplier<T> block){
        return BLOCKS.register(name, block);
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return Items1Init.ITEMS.register(name,
                () -> new BlockItem(block.get(), new Item.Properties().tab(ItemGroupTabs.METALLISTIX_BLOCKS)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

    // Bloques de x9 Lingotes - Blocks of Metal
    public static final RegistryObject<Block> DISPROSIO_BLOCK = registerBlock("disprosio_block",
            () -> new MetalBlock(5f, 8f));
    public static final RegistryObject<Block> FRANITOLINA_BLOCK = registerBlock("franitolina_block",
            () -> new FranitolinaBlock(5f, 8f));
    public static final RegistryObject<Block> MELITONILA_BLOCK = registerBlock("melitonila_block",
            () -> new MetalBlock(5, 8f));
    public static final RegistryObject<Block> ALEZARITA_BLOCK = registerBlock("alezarita_block",
            () -> new MetalBlock(6f, 10f));
    public static final RegistryObject<Block> HALIX_BLOCK = registerBlock("halix_block",
            () -> new MetalBlock(6f, 11f));
    public static final RegistryObject<Block> MIGUELITIO_BLOCK = registerBlock("miguelitio_block",
            () -> new MiguelitioBlock(6f, 12f));

    // Bloques de metal en bruto - Raw metal blocks
    public static final RegistryObject<Block> RAW_DISPROSIO_BLOCK = registerBlock("raw_disprosio_block",
            () -> new MetalBlock(4f, 3f));
    public static final RegistryObject<Block> RAW_FRANITOLINA_BLOCK = registerBlock("raw_franitolina_block",
            () -> new MetalBlock(4f, 3f));
    public static final RegistryObject<Block> RAW_MELITONILA_BLOCK = registerBlock("raw_melitonila_block",
            () -> new MetalBlock(4f, 3f));
    public static final RegistryObject<Block> RAW_ALEZARITA_BLOCK = registerBlock("raw_alezarita_block",
            () -> new MetalBlock(5f, 4f));
    public static final RegistryObject<Block> RAW_HALIX_BLOCK = registerBlock("raw_halix_block",
            () -> new MetalBlock(5f, 4f));
    public static final RegistryObject<Block> RAW_MIGUELITIO_BLOCK = registerBlock("raw_miguelitio_block",
            () -> new MetalBlock(5f, 4f));

    // Lamparas - Lamps
    public static final RegistryObject<Block> DISPROSIO_LAMP =
            registerBlock("disprosio_lamp", LampBlock::new);
    public static final RegistryObject<Block> FRANITOLINA_LAMP =
            registerBlock("franitolina_lamp", LampBlock::new);
    public static final RegistryObject<Block> MELITONILA_LAMP =
            registerBlock("melitonila_lamp", LampBlock::new);
    public static final RegistryObject<Block> ALEZARITA_LAMP =
            registerBlock("alezarita_lamp", LampBlock::new);
    public static final RegistryObject<Block> HALIX_LAMP =
            registerBlock("halix_lamp", LampBlock::new);
    public static final RegistryObject<Block> MIGUELITIO_LAMP =
            registerBlock("miguelitio_lamp", LampBlock::new);

    // Menas normales y profundas - Normal and deepslate Ores
    public static final RegistryObject<Block> DISPROSIO_ORE = registerBlock("disprosio_ore",
            () -> new OreBlock(4f, 4f));
    public static final RegistryObject<Block> FRANITOLINA_ORE = registerBlock("franitolina_ore",
            () -> new OreBlock(4f, 4f));
    public static final RegistryObject<Block> MELITONILA_ORE = registerBlock("melitonila_ore",
            () -> new OreBlock(4f, 4f));
    public static final RegistryObject<Block> ALEZARITA_ORE = registerBlock("alezarita_ore",
            () -> new OreBlock(5f, 6f));
    public static final RegistryObject<Block> HALIX_ORE = registerBlock("halix_ore",
            () -> new OreBlock(5f, 6f));
    public static final RegistryObject<Block> MIGUELITIO_ORE = registerBlock("miguelitio_ore",
            () -> new OreBlock(5f, 6f));
    public static final RegistryObject<Block> DEEPSLATE_DISPROSIO_ORE = registerBlock("deepslate_disprosio_ore",
            () -> new DeepslateOreBlock(4.5f, 4f));
    public static final RegistryObject<Block> DEEPSLATE_FRANITOLINA_ORE = registerBlock("deepslate_franitolina_ore",
            () -> new DeepslateOreBlock(4.5f, 5f));
    public static final RegistryObject<Block> DEEPSLATE_MELITONILA_ORE = registerBlock("deepslate_melitonila_ore",
            () -> new DeepslateOreBlock(4.5f, 5f));

    // Especiales - Specials
    public static final RegistryObject<Block> METALLISTIX_BLOCK =
            registerBlock("metallistix_block", MetallistixBlock::new);

    // Flores - Flowers
    public static final RegistryObject<Block> SOLIMA = registerBlock("solima",
            () -> new FlowerBlock(MobEffects.GLOWING, 3,
                    BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion()));
    public static final RegistryObject<Block> POTTED_SOLIMA = registerBlockNoItem("potted_solima",
            () -> new FlowerPotBlock(null, BlocksInit.SOLIMA,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
    public static final RegistryObject<Block> FERMIN = registerBlock("fermin",
            () -> new FlowerBlock(MobEffects.CONFUSION, 5,
                    BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion()));
    public static final RegistryObject<Block> POTTED_FERMIN = registerBlockNoItem("potted_fermin",
            () -> new FlowerPotBlock(null, BlocksInit.FERMIN,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
}

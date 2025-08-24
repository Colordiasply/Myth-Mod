package colormaya.mythosmod.mod.block;

import colormaya.mythosmod.mod.MythosMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block LIMESTONE_BRICKS = registerBlock("limestone_bricks",
            new Block(AbstractBlock.Settings.create().requiresTool().strength(1.5F, 2.0F).sounds(BlockSoundGroup.DRIPSTONE_BLOCK).mapColor(MapColor.TERRACOTTA_BROWN).instrument(Instrument.BASEDRUM)));
    public static final Block CHISELED_LIMESTONE_BRICKS = registerBlock("chiseled_limestone_bricks",
            new Block(AbstractBlock.Settings.create().requiresTool().strength(1.5F, 2.0F).sounds(BlockSoundGroup.DRIPSTONE_BLOCK).mapColor(MapColor.TERRACOTTA_BROWN).instrument(Instrument.BASEDRUM)));
    static final Block LIMESTONE = registerBlock("limestone",
            new Block(AbstractBlock.Settings.create().requiresTool().strength(1.5F, 2.0F).sounds(BlockSoundGroup.DRIPSTONE_BLOCK).mapColor(MapColor.TERRACOTTA_BROWN).instrument(Instrument.BASEDRUM)));
    static final Block LIMESTONE_PILLAR = registerBlock("limestone_pillar",
            new Block(AbstractBlock.Settings.create().requiresTool().strength(1.5F, 2.0F).sounds(BlockSoundGroup.DRIPSTONE_BLOCK).mapColor(MapColor.TERRACOTTA_BROWN).instrument(Instrument.BASEDRUM)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
    return Registry.register(Registries. BLOCK, Identifier.of(MythosMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(MythosMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }
    public static void registerModBlocks() {
        MythosMod.LOGGER.info("Registering Mod Blocks for " + MythosMod.MOD_ID);

            ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
                entries.add(LIMESTONE);
                entries.add(LIMESTONE_PILLAR);
                entries.add(LIMESTONE_BRICKS);
                entries.add(CHISELED_LIMESTONE_BRICKS);

            });
        }
    }
package colormaya.mythosmod.mod.item;

import colormaya.mythosmod.mod.MythosMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item LIMESTONE_CHUNK = registerItem("limestone_chunk", new Item(new Item.Settings()));

    public static final Item RoseGold_Ingot = registerItem("rosegold_ingot", new Item(new Item.Settings()));

    public static final Item RoseGold_Nugget = registerItem("rosegold_nugget", new Item(new Item.Settings()));

    public static final Item Raw_RoseGold = registerItem("raw_rosegold", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MythosMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MythosMod.LOGGER.info("Registering Mod Items for " + MythosMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(LIMESTONE_CHUNK);
            entries.add(RoseGold_Ingot);
            entries.add(RoseGold_Ingot);
            entries.add(RoseGold_Nugget);
            entries.add(Raw_RoseGold);

        });
    }
}



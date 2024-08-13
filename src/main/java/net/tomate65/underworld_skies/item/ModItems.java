package net.tomate65.underworld_skies.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.tomate65.underworld_skies.Underworld_skies;

public class ModItems {
    public static final Item Crystal = registerItem("crystal", new Item(new Item.Settings()));
    public static final Item Orb_Of_Shadow = registerItem("orb_of_shadow", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Underworld_skies.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Underworld_skies.LOGGER.info("Registering Mod Item for " + Underworld_skies.MOD_ID);


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(Crystal);
            entries.add(Orb_Of_Shadow);
        });
    }
}
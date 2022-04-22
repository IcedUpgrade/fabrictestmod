package net.icedupgrade.fabrictestmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.icedupgrade.fabrictestmod.FabricTestMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry
import java.rmi.registry.Registry;
import java.util.IdentityHashMap;

public class ModItems {
    public static final Item MYTHRIL_INGOT =registerItem("mythril_ingot"),
        new Item(new FabricItemSettings().group(ItemGroup.MISC)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(FabricTestMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        FabricTestMod.LOGGER.info("Registering Mod Items for " + FabricTestMod.MOD_ID);
    }
}

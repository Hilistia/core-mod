package com.hilistia.hilistiacore;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class HilistiaItems {

    public static void initialize() {
        Registry.register(Registries.ITEM_GROUP, HILISTIA_ITEM_GROUP_KEY, HILISTIA_ITEM_GROUP);
        ItemGroupEvents.modifyEntriesEvent(HILISTIA_ITEM_GROUP_KEY).register(itemGroup -> {
            itemGroup.add(HilistiaItems.SUS_TOTEM);
        });
    }

    public static final RegistryKey<ItemGroup> HILISTIA_ITEM_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), new Identifier(HilistiaCore.MOD_ID, "item_group"));
    public static final ItemGroup HILISTIA_ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(HilistiaItems.SUS_TOTEM))
            .displayName(Text.translatable("itemGroup.hilistia_items"))
            .build();

    public static Item register(Item item, String id) {
        Identifier itemId = new Identifier(HilistiaCore.MOD_ID, id);
        return Registry.register(Registries.ITEM, itemId, item);
    }

    public static final Item SUS_TOTEM = register(
            new Item(new FabricItemSettings().maxCount(1)),
            "suspicious_totem"
    );
}

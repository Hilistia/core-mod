package com.hilistia.hilistiacore;

import favouriteless.enchanted.api.rites.AbstractCreateItemRite;
import favouriteless.enchanted.common.init.registry.EnchantedBlocks;
import favouriteless.enchanted.common.rites.CirclePart;
import favouriteless.enchanted.common.rites.RiteType;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import java.util.UUID;

public class RiteOfferingGeneric extends AbstractCreateItemRite {

    public RiteOfferingGeneric(RiteType<?> type, ServerLevel level, BlockPos pos, UUID caster) {
        super(type, level, pos, caster, 2000, SoundEvents.ENTITY_ALLAY_AMBIENT_WITH_ITEM, new ItemStack(HilistiaItems.SUS_TOTEM, 1));
        CIRCLES_REQUIRED.put(CirclePart.SMALL, EnchantedBlocks.RITUAL_CHALK.get());
        ITEMS_REQUIRED.put(Items.TOTEM_OF_UNDYING, 1);
    }
}

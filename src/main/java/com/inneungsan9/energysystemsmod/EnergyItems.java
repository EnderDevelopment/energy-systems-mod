package com.inneungsan9.energysystemsmod;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class EnergyItems {
    public static final Item ENERGY_CELL = new Item(new Item.Settings());

    public static void register() {
        Registry.register(Registries.ITEM, new Identifier(EnergySystemsMod.MOD_ID, "energy_cell"), ENERGY_CELL);
    }
}
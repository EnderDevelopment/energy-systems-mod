package com.inneungsan9.energysystemsmod;

import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class EnergyBlocks {
    public static final Block ENERGY_GENERATOR = new Block(Block.Settings.of(Material.METAL));
    public static final Block ENERGY_CONSUMER = new Block(Block.Settings.of(Material.METAL));

    public static void register() {
        Registry.register(Registries.BLOCK, new Identifier(EnergySystemsMod.MOD_ID, "energy_generator"), ENERGY_GENERATOR);
        Registry.register(Registries.BLOCK, new Identifier(EnergySystemsMod.MOD_ID, "energy_consumer"), ENERGY_CONSUMER);
    }
}
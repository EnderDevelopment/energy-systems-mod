package com.inneungsan9.energysystemsmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EnergySystemsMod implements ModInitializer {
    public static final String MOD_ID = "energysystemsmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Energy Systems Mod");
        EnergyItems.register();
        EnergyBlocks.register();
    }
}
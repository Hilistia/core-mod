package com.hilistia.hilistiacore;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HilistiaCore implements ModInitializer {

    public static final String MOD_ID = "hilistiacore";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


    @Override
    public void onInitialize() {
        LOGGER.info("Unpacking the mysteries of the world");
        HilistiaItems.initialize();
    }
}

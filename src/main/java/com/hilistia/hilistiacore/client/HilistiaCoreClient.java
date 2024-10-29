package com.hilistia.hilistiacore.client;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
public class HilistiaCoreClient implements ClientModInitializer {

    public static final String MOD_ID = "hilistia-core";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitializeClient() {
        LOGGER.info("Hello Fabric Client");
    }
}

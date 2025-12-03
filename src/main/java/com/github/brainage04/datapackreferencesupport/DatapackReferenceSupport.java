package com.github.brainage04.datapackreferencesupport;

import com.github.brainage04.datapackreferencesupport.command.core.ModCommands;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DatapackReferenceSupport implements ModInitializer {
    public static final String MOD_ID = "datapackreferencesupport";
    public static final String MOD_NAME = "DatapackReferenceSupport";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        LOGGER.info("{} initialising...", MOD_NAME);

        ModCommands.initialize();

        LOGGER.info("{} initialised.", MOD_NAME);
	}
}
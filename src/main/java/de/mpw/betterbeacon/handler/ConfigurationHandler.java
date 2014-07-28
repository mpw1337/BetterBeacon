package de.mpw.betterbeacon.handler;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import de.mpw.betterbeacon.reference.Reference;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Markus on 28.07.2014.
 */
public class ConfigurationHandler {
    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init(File configFile) {
        //Create the configuration object from the given configuration file
        if (configuration == null) {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID)) {
            //Resync configs
            loadConfiguration();
        }
    }

    private static void loadConfiguration() {
        testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "This is an examplpe");
        if (configuration.hasChanged()) {
            configuration.save();
        }
    }
}

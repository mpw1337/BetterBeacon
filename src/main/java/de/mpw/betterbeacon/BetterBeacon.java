package de.mpw.betterbeacon;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import de.mpw.betterbeacon.handler.ConfigurationHandler;
import de.mpw.betterbeacon.init.ModBlocks;
import de.mpw.betterbeacon.init.ModItems;
import de.mpw.betterbeacon.proxy.IProxy;
import de.mpw.betterbeacon.reference.Reference;
import de.mpw.betterbeacon.utility.LogHelper;

/**
 * Created by Markus on 25.07.2014.
 */
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class BetterBeacon {

    @Mod.Instance(Reference.MOD_ID)
    public static BetterBeacon instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    /**
     * Network configuration handling
     * Item/Block initialisation
     */
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        ModItems.init();
        ModBlocks.init();
        LogHelper.info("Pre Initialisation Complete");
    }

    /**
     * Crafting, Gui Tile Entitys, gernearl Event Handlers
     *
     * @param event
     */
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        LogHelper.info("Initialisation Complete");
    }

    /**
     * Wrap things up
     *
     * @param event
     */
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        LogHelper.info("Post Initialisation Complete");
    }

}

package de.mpw.betterbeacon;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Markus on 25.07.2014.
 */
@Mod(modid = "test", name = "BetterBeacon")
public class BetterBeacon {
    @Mod.Instance("modid")
    public static BetterBeacon instance;

    /**
     * Network configuration handling
     * Item/Block initialisation
     */
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    /**
     * Crafting, Gui Tile Entitys, gernearl Event Handlers
     *
     * @param event
     */
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    /**
     * Wrap things up
     *
     * @param event
     */
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

}

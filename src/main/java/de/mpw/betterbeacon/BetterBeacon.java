package de.mpw.betterbeacon;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import de.mpw.betterbeacon.proxy.IProxy;
import de.mpw.betterbeacon.reference.Reference;

/**
 * Created by Markus on 25.07.2014.
 */
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class BetterBeacon {
    @Mod.Instance(Reference.MOD_ID)
    public static BetterBeacon instance;
    @SidedProxy(clientSide = "de.mpw.betterbeacon.proxy.ClientProxy", serverSide = "de.mpw.betterbeacon.proxy.ServerProxy")
    public static IProxy proxy;

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

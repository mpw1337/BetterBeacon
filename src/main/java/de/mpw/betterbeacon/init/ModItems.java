package de.mpw.betterbeacon.init;

import cpw.mods.fml.common.registry.GameRegistry;
import de.mpw.betterbeacon.item.ItemBB;
import de.mpw.betterbeacon.item.ItemBetterBeaconRemote;

/**
 * Created by Markus on 28.07.2014.
 */
public class ModItems {
    public static final ItemBB betterBeaconRemote = new ItemBetterBeaconRemote();

    public static void init() {
        GameRegistry.registerItem(betterBeaconRemote, ItemBetterBeaconRemote.ITEM_NAME);
    }
}

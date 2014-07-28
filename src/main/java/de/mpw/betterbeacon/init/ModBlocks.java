package de.mpw.betterbeacon.init;

import cpw.mods.fml.common.registry.GameRegistry;
import de.mpw.betterbeacon.block.BlockBB;
import de.mpw.betterbeacon.block.BlockBetterBeacon;

/**
 * Created by Markus on 28.07.2014.
 */
public class ModBlocks {
    public static final BlockBB beacon = new BlockBetterBeacon();

    public static void init() {
        GameRegistry.registerBlock(beacon, BlockBetterBeacon.NAME);
    }
}

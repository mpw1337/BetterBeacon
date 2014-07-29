package de.mpw.betterbeacon.creativetab;

import de.mpw.betterbeacon.init.ModItems;
import de.mpw.betterbeacon.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Markus on 29.07.2014.
 */
public class CreativeTabBB {
    public static final CreativeTabs CreativeTabs_BB_TAB = new CreativeTabs(Reference.MOD_ID) {
        @Override
        public Item getTabIconItem() {
            return ModItems.betterBeaconRemote;
        }
    };

}

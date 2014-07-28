package de.mpw.betterbeacon.block;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by Markus on 28.07.2014.
 */
public class BlockBetterBeacon extends BlockBB implements ITileEntityProvider {

    public static final String NAME = "betterBeacon";

    public BlockBetterBeacon() {
        super();
        this.setLightLevel(1.0F);
    }

    @Override
    public int getRenderType() {
        return 34;
    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return null;
    }
}

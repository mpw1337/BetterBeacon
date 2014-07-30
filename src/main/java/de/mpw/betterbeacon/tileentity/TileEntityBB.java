package de.mpw.betterbeacon.tileentity;

import de.mpw.betterbeacon.reference.Names;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;

/**
 * Created by Markus on 30.07.2014.
 */
public class TileEntityBB extends TileEntity {
    protected byte state;
    protected ForgeDirection orientation;

    public TileEntityBB() {
        orientation = ForgeDirection.SOUTH;
        state = 0;

    }

    public ForgeDirection getDirection() {
        return orientation;
    }

    public void setOrientation(ForgeDirection orientation) {
        this.orientation = orientation;
    }

    public void setOrientation(int orientation) {
        this.orientation = ForgeDirection.getOrientation(orientation);
    }

    public short getState() {
        return state;
    }

    @Override
    public void readFromNBT(NBTTagCompound nbtTagCompound) {
        super.readFromNBT(nbtTagCompound);
        if (nbtTagCompound.hasKey(Names.NBT.DIRECTION)) {
            this.orientation = ForgeDirection.getOrientation(nbtTagCompound.getByte(Names.NBT.DIRECTION));
        }
    }

    @Override
    public void writeToNBT(NBTTagCompound nbtTagCompound) {
        super.writeToNBT(nbtTagCompound);
        nbtTagCompound.setByte(Names.NBT.DIRECTION, (byte) orientation.ordinal());
    }
}

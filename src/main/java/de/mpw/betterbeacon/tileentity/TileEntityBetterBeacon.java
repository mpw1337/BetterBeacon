package de.mpw.betterbeacon.tileentity;

import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;

import java.util.List;

/**
 * Created by Markus on 30.07.2014.
 */
public class TileEntityBetterBeacon extends TileEntityBB {

    private boolean isBeaconActive = true;
    private int levels;
    private int effect;
    private boolean playereffect = true;
    private boolean mobeffect = true;
    private boolean animaleffect = true;
    private PotionEffect potionEffect;
    private int potionTime = 180;
    private int effectStrength;

    public TileEntityBetterBeacon() {
        super();
        levels = 5;
        effect = 8;
        potionTime = 5000;
        effectStrength = 3;

    }

    public void updateEntity() {
        if (this.getWorldObj().getTotalWorldTime() % 1L == 0L) {
            testPyramide();
            applyPotionEffects();
        }
    }

    private void testPyramide() {
    }

    private void applyPotionEffects() {
        if (this.isBeaconActive && this.levels > 0 && !this.worldObj.isRemote && this.effect > 0) {
            double distance = (double) (this.levels * 10 + 10);
            AxisAlignedBB axisalignedbb = AxisAlignedBB.getBoundingBox(this.xCoord, this.yCoord, this.zCoord, this.xCoord + 1, this.yCoord + 1, this.zCoord + 1).expand(distance, distance, distance);
            axisalignedbb.maxY = (double) this.worldObj.getHeight();
            axisalignedbb.minY = 1;
            potionEffect = new PotionEffect(effect, potionTime, effectStrength, true);
            if (playereffect) {
                this.addEffectsToPlayers(axisalignedbb);
            }

            if (mobeffect) {
                this.addEffectsToHostile(axisalignedbb);
            }
            if (animaleffect) {
                this.addEffectsToAnimal(axisalignedbb);
            }
        }
    }

    private void addEffectsToPlayers(AxisAlignedBB range) {
        List players = this.worldObj.getEntitiesWithinAABB(EntityPlayer.class, range);
        EntityPlayer entityPlayer;
        for (Object p : players) {
            entityPlayer = (EntityPlayer) p;
            entityPlayer.addPotionEffect(potionEffect);

        }
    }

    private void addEffectsToHostile(AxisAlignedBB range) {
        List hostile = worldObj.getEntitiesWithinAABB(EntityMob.class, range);
        EntityMob entityMob;
        for (Object mob : hostile) {
            entityMob = (EntityMob) mob;
            entityMob.addPotionEffect(potionEffect);
        }
    }

    private void addEffectsToAnimal(AxisAlignedBB range) {
        List animal = worldObj.getEntitiesWithinAABB(EntityAnimal.class, range);
        EntityAnimal entityAnimal;
        for (Object a : animal) {
            entityAnimal = (EntityAnimal) a;
            entityAnimal.addPotionEffect(potionEffect);
        }
    }

}

package net.shinemod;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.shinemod.configuration.ItemBlockHolder;

public class ShineItem extends Item {
	
	public ShineItem(int par1){
		super(par1);
	
	}

	  public void registerIcons(IconRegister par1IconRegister)
	    {
	        this.itemIcon = par1IconRegister.registerIcon("mod/" + this.getUnlocalizedName().substring(5));
	    }
	  
	 public void isLightingSword(String par1Str)
	 {
		 
		 par1Str = this.getUnlocalizedName();
		 if(par1Str == "FusionSword")
		 {
		 //onItemRightClick(ItemBlockHolder.BlueSpade, World.class, EntityPlayer.class);
		 }
	 }


public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
	  {
    float f = 1.0F;
    float f1 = entityplayer.prevRotationPitch + (entityplayer.rotationPitch - entityplayer.prevRotationPitch) * f;
    float f2 = entityplayer.prevRotationYaw + (entityplayer.rotationYaw - entityplayer.prevRotationYaw) * f;
    double d = entityplayer.prevPosX + (entityplayer.posX - entityplayer.prevPosX) * (double)f;
    double d1 = (entityplayer.prevPosY + (entityplayer.posY - entityplayer.prevPosY) * (double)f + 1.6200000000000001D) - (double)entityplayer.yOffset;
    double d2 = entityplayer.prevPosZ + (entityplayer.posZ - entityplayer.prevPosZ) * (double)f;
    Vec3 vec3d = Vec3.createVectorHelper(d, d1, d2);
    float f3 = MathHelper.cos(-f2 * 0.01745329F - 3.141593F);
    float f4 = MathHelper.sin(-f2 * 0.01745329F - 3.141593F);
    float f5 = -MathHelper.cos(-f1 * 0.01745329F);
    float f6 = MathHelper.sin(-f1 * 0.01745329F);
    float f7 = f4 * f5;
    float f8 = f6;
    float f9 = f3 * f5;
    double d3 = 5000D;
    Vec3 vec3d1 = vec3d.addVector((double)f7 * d3, (double)f8 * d3, (double)f9 * d3);
    MovingObjectPosition movingobjectposition = world.rayTraceBlocks_do_do(vec3d, vec3d1, false, true);
    if (movingobjectposition == null) 
    {
    return itemstack;
    }
    if (movingobjectposition.typeOfHit == EnumMovingObjectType.TILE) 
    {
    int i = movingobjectposition.blockX;
        int j = movingobjectposition.blockY;
        int k = movingobjectposition.blockZ;
        world.spawnEntityInWorld(new EntityLightningBolt(world, i, j, k));
    }
    return itemstack;
}
}
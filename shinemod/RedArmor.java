package net.shinemod;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;
import net.shinemod.configuration.ItemBlockHolder;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class RedArmor extends ItemArmor implements IArmorTextureProvider{

	public RedArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial,
			int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getArmorTextureFile(ItemStack itemstack) {
		if(itemstack.itemID == ItemBlockHolder.RedHelmet.itemID || itemstack.itemID == ItemBlockHolder.RedPlate.itemID || itemstack.itemID == ItemBlockHolder.RedBoots.itemID){
			return "/armor/Red_1.png";
			}
			
			if(itemstack.itemID == ItemBlockHolder.RedLegs.itemID){
				return "/armor/Red_2.png";
			}
	
			else return null;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
	if(this == ItemBlockHolder.RedHelmet)
		this.itemIcon = par1IconRegister.registerIcon("mod/RedHelmet");
	
		if(this == ItemBlockHolder.RedPlate)
			this.itemIcon = par1IconRegister.registerIcon("mod/RedBody");
			
			if(this == ItemBlockHolder.RedLegs)
				this.itemIcon = par1IconRegister.registerIcon("mod/RedPants");
	
				if(this == ItemBlockHolder.RedBoots)
					this.itemIcon = par1IconRegister.registerIcon("mod/RedBoots");
	
	
	}		

}		

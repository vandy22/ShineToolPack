package net.shinemod;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;
import net.shinemod.configuration.ItemBlockHolder;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PurpleArmor extends ItemArmor implements IArmorTextureProvider{

	public PurpleArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial,
			int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getArmorTextureFile(ItemStack itemstack) {
		if(itemstack.itemID == ItemBlockHolder.PurpleHelmet.itemID || itemstack.itemID == ItemBlockHolder.PurplePlate.itemID || itemstack.itemID == ItemBlockHolder.PurpleBoots.itemID){
			return "/armor/Purple_1.png";
			}
			
			if(itemstack.itemID == ItemBlockHolder.PurpleLegs.itemID){
				return "/armor/Purple_2.png";
			}
	
			else return null;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
	if(this == ItemBlockHolder.PurpleHelmet)
		this.itemIcon = par1IconRegister.registerIcon("mod/PurpleHelmet");
	
		if(this == ItemBlockHolder.PurplePlate)
			this.itemIcon = par1IconRegister.registerIcon("mod/PurpleBody");
			
			if(this == ItemBlockHolder.PurpleLegs)
				this.itemIcon = par1IconRegister.registerIcon("mod/PurplePants");
	
				if(this == ItemBlockHolder.PurpleBoots)
					this.itemIcon = par1IconRegister.registerIcon("mod/PurpleBoots");
	
	
	}		

}		

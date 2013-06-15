package net.shinemod;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;
import net.shinemod.configuration.ItemBlockHolder;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlackWhiteArmor extends ItemArmor implements IArmorTextureProvider{

	public BlackWhiteArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial,
			int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getArmorTextureFile(ItemStack itemstack) {
		if(itemstack.itemID == ItemBlockHolder.BlackWhiteHelmet.itemID || itemstack.itemID == ItemBlockHolder.BlackWhitePlate.itemID || itemstack.itemID == ItemBlockHolder.BlackWhiteBoots.itemID){
			return "/armor/BlackWhite_1.png";
			}
			
			if(itemstack.itemID == ItemBlockHolder.BlackWhiteLegs.itemID){
				return "/armor/BlackWhite_2.png";
			}
	
			else return null;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
	if(this == ItemBlockHolder.BlackWhiteHelmet)
		this.itemIcon = par1IconRegister.registerIcon("mod/BlackWhiteHelmet");
	
		if(this == ItemBlockHolder.BlackWhitePlate)
			this.itemIcon = par1IconRegister.registerIcon("mod/BlackWhiteBody");
			
			if(this == ItemBlockHolder.BlackWhiteLegs)
				this.itemIcon = par1IconRegister.registerIcon("mod/BlackWhitePants");
	
				if(this == ItemBlockHolder.BlackWhiteBoots)
					this.itemIcon = par1IconRegister.registerIcon("mod/BlackWhiteBoots");
	
	
	}		

}		

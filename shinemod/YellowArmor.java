package net.shinemod;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;
import net.shinemod.configuration.ItemBlockHolder;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class YellowArmor extends ItemArmor implements IArmorTextureProvider{

	public YellowArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial,
			int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getArmorTextureFile(ItemStack itemstack) {
		if(itemstack.itemID == ItemBlockHolder.YellowHelmet.itemID || itemstack.itemID == ItemBlockHolder.YellowPlate.itemID || itemstack.itemID == ItemBlockHolder.YellowBoots.itemID){
			return "/armor/Yellow_1.png";
			}
			
			if(itemstack.itemID == ItemBlockHolder.YellowLegs.itemID){
				return "/armor/Yellow_2.png";
			}
	
			else return null;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
	if(this == ItemBlockHolder.YellowHelmet)
		this.itemIcon = par1IconRegister.registerIcon("mod/YellowHelmet");
	
		if(this == ItemBlockHolder.YellowPlate)
			this.itemIcon = par1IconRegister.registerIcon("mod/YellowBody");
			
			if(this == ItemBlockHolder.YellowLegs)
				this.itemIcon = par1IconRegister.registerIcon("mod/YellowPants");
	
				if(this == ItemBlockHolder.YellowBoots)
					this.itemIcon = par1IconRegister.registerIcon("mod/YellowBoots");
	
	
	}		

}		

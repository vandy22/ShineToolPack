package net.shinemod;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;
import net.shinemod.configuration.ItemBlockHolder;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class GreenArmor extends ItemArmor implements IArmorTextureProvider{

	public GreenArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial,
			int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getArmorTextureFile(ItemStack itemstack) {
		if(itemstack.itemID == ItemBlockHolder.GreenHelmet.itemID || itemstack.itemID == ItemBlockHolder.GreenPlate.itemID || itemstack.itemID == ItemBlockHolder.GreenBoots.itemID){
			return "/armor/Green_1.png";
			}
			
			if(itemstack.itemID == ItemBlockHolder.GreenLegs.itemID){
				return "/armor/Green_2.png";
			}
	
			else return null;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
	if(this == ItemBlockHolder.GreenHelmet)
		this.itemIcon = par1IconRegister.registerIcon("mod/GreenHelmet");
	
		if(this == ItemBlockHolder.GreenPlate)
			this.itemIcon = par1IconRegister.registerIcon("mod/GreenBody");
			
			if(this == ItemBlockHolder.GreenLegs)
				this.itemIcon = par1IconRegister.registerIcon("mod/GreenPants");
	
				if(this == ItemBlockHolder.GreenBoots)
					this.itemIcon = par1IconRegister.registerIcon("mod/GreenBoots");
	
	
	}		

}		

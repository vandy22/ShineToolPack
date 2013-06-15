package net.shinemod;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;
import net.shinemod.configuration.ItemBlockHolder;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlackArmor extends ItemArmor implements IArmorTextureProvider{

	public BlackArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial,
			int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getArmorTextureFile(ItemStack itemstack) {
		if(itemstack.itemID == ItemBlockHolder.BlackHelmet.itemID || itemstack.itemID == ItemBlockHolder.BlackPlate.itemID || itemstack.itemID == ItemBlockHolder.BlackBoots.itemID){
			return "/armor/Black_1.png";
			}
			
			if(itemstack.itemID == ItemBlockHolder.BlackLegs.itemID){
				return "/armor/Black_2.png";
			}
	
			else return null;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
	if(this == ItemBlockHolder.BlackHelmet)
		this.itemIcon = par1IconRegister.registerIcon("mod/BlackHelmet");
	
		if(this == ItemBlockHolder.BlackPlate)
			this.itemIcon = par1IconRegister.registerIcon("mod/BlackBody");
			
			if(this == ItemBlockHolder.BlackLegs)
				this.itemIcon = par1IconRegister.registerIcon("mod/BlackPants");
	
				if(this == ItemBlockHolder.BlackBoots)
					this.itemIcon = par1IconRegister.registerIcon("mod/BlackBoots");
	
	
	}		

}		

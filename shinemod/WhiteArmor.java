package net.shinemod;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;
import net.shinemod.configuration.ItemBlockHolder;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class WhiteArmor extends ItemArmor implements IArmorTextureProvider{

	public WhiteArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial,
			int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getArmorTextureFile(ItemStack itemstack) {
		if(itemstack.itemID == ItemBlockHolder.WhiteHelmet.itemID || itemstack.itemID == ItemBlockHolder.WhitePlate.itemID || itemstack.itemID == ItemBlockHolder.WhiteBoots.itemID){
			return "/armor/White_1.png";
			}
			
			if(itemstack.itemID == ItemBlockHolder.WhiteLegs.itemID){
				return "/armor/White_2.png";
			}
	
			else return null;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
	if(this == ItemBlockHolder.WhiteHelmet)
		this.itemIcon = par1IconRegister.registerIcon("mod/WhiteHelmet");
	
		if(this == ItemBlockHolder.WhitePlate)
			this.itemIcon = par1IconRegister.registerIcon("mod/WhiteBody");
			
			if(this == ItemBlockHolder.WhiteLegs)
				this.itemIcon = par1IconRegister.registerIcon("mod/WhitePants");
	
				if(this == ItemBlockHolder.WhiteBoots)
					this.itemIcon = par1IconRegister.registerIcon("mod/WhiteBoots");
	
	
	}		

}		

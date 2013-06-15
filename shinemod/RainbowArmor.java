package net.shinemod;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;
import net.shinemod.configuration.ItemBlockHolder;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class RainbowArmor extends ItemArmor implements IArmorTextureProvider{

	public RainbowArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial,
			int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getArmorTextureFile(ItemStack itemstack) {
		if(itemstack.itemID == ItemBlockHolder.RainbowHelmet.itemID || itemstack.itemID == ItemBlockHolder.RainbowPlate.itemID || itemstack.itemID == ItemBlockHolder.RainbowBoots.itemID){
			return "/armor/Rainbow_1.png";
			}
			
			if(itemstack.itemID == ItemBlockHolder.RainbowLegs.itemID){
				return "/armor/Rainbow_2.png";
			}
	
			else return null;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
	if(this == ItemBlockHolder.RainbowHelmet)
		this.itemIcon = par1IconRegister.registerIcon("mod/RainbowHelmet");
	
		if(this == ItemBlockHolder.RainbowPlate)
			this.itemIcon = par1IconRegister.registerIcon("mod/RainbowBody");
			
			if(this == ItemBlockHolder.RainbowLegs)
				this.itemIcon = par1IconRegister.registerIcon("mod/RainbowPants");
	
				if(this == ItemBlockHolder.RainbowBoots)
					this.itemIcon = par1IconRegister.registerIcon("mod/RainbowBoots");
	
	
	}		

}		

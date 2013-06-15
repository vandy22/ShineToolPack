package net.shinemod;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;
import net.shinemod.configuration.ItemBlockHolder;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PinkArmor extends ItemArmor implements IArmorTextureProvider{

	public PinkArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial,
			int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getArmorTextureFile(ItemStack itemstack) {
		if(itemstack.itemID == ItemBlockHolder.PinkHelmet.itemID || itemstack.itemID == ItemBlockHolder.PinkPlate.itemID || itemstack.itemID == ItemBlockHolder.PinkBoots.itemID){
			return "/armor/Pink_1.png";
			}
			
			if(itemstack.itemID == ItemBlockHolder.PinkLegs.itemID){
				return "/armor/Pink_2.png";
			}
	
			else return null;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
	if(this == ItemBlockHolder.PinkHelmet)
		this.itemIcon = par1IconRegister.registerIcon("mod/PinkHelmet");
	
		if(this == ItemBlockHolder.PinkPlate)
			this.itemIcon = par1IconRegister.registerIcon("mod/PinkBody");
			
			if(this == ItemBlockHolder.PinkLegs)
				this.itemIcon = par1IconRegister.registerIcon("mod/PinkPants");
	
				if(this == ItemBlockHolder.PinkBoots)
					this.itemIcon = par1IconRegister.registerIcon("mod/PinkBoots");
	
	
	}		

}		

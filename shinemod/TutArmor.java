package net.shinemod;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;
import net.shinemod.configuration.ItemBlockHolder;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TutArmor extends ItemArmor implements IArmorTextureProvider{

	public TutArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial,
			int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getArmorTextureFile(ItemStack itemstack) {
		if(itemstack.itemID == ItemBlockHolder.TutorialHelmet.itemID || itemstack.itemID == ItemBlockHolder.TutorialPlate.itemID || itemstack.itemID == ItemBlockHolder.TutorialBoots.itemID){
			return "/armor/Blue_1.png";
			}
			
			if(itemstack.itemID == ItemBlockHolder.TutorialLegs.itemID){
				return "/armor/Blue_2.png";
			}
	
			else return null;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
	if(this == ItemBlockHolder.TutorialHelmet)
		this.itemIcon = par1IconRegister.registerIcon("mod/BlueHelmet");
	
		if(this == ItemBlockHolder.TutorialPlate)
			this.itemIcon = par1IconRegister.registerIcon("mod/BlueBody");
			
			if(this == ItemBlockHolder.TutorialLegs)
				this.itemIcon = par1IconRegister.registerIcon("mod/BluePants");
	
				if(this == ItemBlockHolder.TutorialBoots)
					this.itemIcon = par1IconRegister.registerIcon("mod/BlueBoots");
	
	
	}		

}		

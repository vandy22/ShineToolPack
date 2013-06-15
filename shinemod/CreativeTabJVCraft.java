package net.shinemod;

import net.minecraft.creativetab.CreativeTabs;
import net.shinemod.configuration.ItemBlockHolder;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTabJVCraft extends CreativeTabs{
	
	private int tabIndexID;
	private String tabName;
	
	
	CreativeTabJVCraft(int par1, String par3Str, String par4String ) {
		super(par1, par3Str);
	
		this.tabName = par4String;
		
	}

	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex(){
		return ItemBlockHolder.BasicCube.blockID;
	}

	public String getTranslatedTabLabel(){
		return this.tabName;
	}

}

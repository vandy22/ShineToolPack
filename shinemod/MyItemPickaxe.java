package net.shinemod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.util.Icon;
import net.shinemod.client.ClientProxy.ClientProxy;


public class MyItemPickaxe extends ItemPickaxe {

	public MyItemPickaxe(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
	
	}
	
	 public void registerIcons(IconRegister par1IconRegister)
	    {
	        this.itemIcon = par1IconRegister.registerIcon("mod/" + this.getUnlocalizedName().substring(5));
	    }

}
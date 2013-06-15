package net.shinemod;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.shinemod.configuration.ItemBlockHolder;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ShineBlock extends Block {

	private String blockTexture;
	
	public ShineBlock(int par1, Material par2Material, String par3String){
		super(par1, par2Material);
	
		this.blockTexture = par3String;
	}

	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister){
		this.blockIcon = par1IconRegister.registerIcon("mod/" + this.blockTexture);
	}
	

	 public int idDropped(int par1, Random par2Random, int par3)
	    {
	        return this.blockID == ItemBlockHolder.FusionOre.blockID ? ItemBlockHolder.FusionShard.itemID : this.blockID;
	    }

	 public int quantityDropped(Random par1Random)
	    {
	        return this.blockID == ItemBlockHolder.FusionOre.blockID ? 4 + par1Random.nextInt(5) : 1;
	    }
}
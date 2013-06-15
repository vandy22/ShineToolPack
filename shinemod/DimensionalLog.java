package net.shinemod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class DimensionalLog extends Block{

private String topS, sideS, bottomS;
	
public DimensionalLog(int par1, Material par2Material, String par3Str, String par4Str, String par5Str)
{
	super(par1, par2Material);
	this.setHardness(2.0F);
	this.setStepSound(soundWoodFootstep);
	this.topS = par3Str;
	this.sideS = par4Str;
	this.bottomS = par5Str;
}

private Icon sides, top, bottom;
	
@SideOnly(Side.CLIENT)
@Override
public void registerIcons(IconRegister iconRegister)
{
         this.top = iconRegister.registerIcon("mod/" + this.topS);//eclipsetree_top);
         this.sides = iconRegister.registerIcon("mod/" + this.sideS); //eclipsetree_side); //+ this.getUnlocalizedName().substring(5));
         this.bottom = iconRegister.registerIcon("mod/" + this.bottomS);//eclipsetree_bottom);
}	

@SideOnly(Side.CLIENT)
@Override
public Icon getIcon(int side, int meta)
{
	/*
	if (meta == 0 && side == 3)
        return side1;
       if (meta == 2 && side == 2)
        return side1;
       if (meta == 1 && side == 4)
        return side1;
       if (meta == 3 && side == 5)
        return side1;
       return blockIcon;
	*/
		if (side == 0)
		{
			return bottom;
		}
		if (side == 1)
		{
			return top;
		}
		else
		{
			return sides;
		}
	}
	
}

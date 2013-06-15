package net.shinemod.dimensions;

import java.util.Random;

import net.minecraft.block.BlockPortal;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;
import net.shinemod.configuration.ItemBlockHolder;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EclipsePortal extends BlockPortal
{
       public EclipsePortal(int id)
       {
             super(id);
             this.setCreativeTab(CreativeTabs.tabBlock);
       }
      
       @SideOnly(Side.CLIENT)
   		public void registerIcons(IconRegister par1IconRegister){
   		this.blockIcon = par1IconRegister.registerIcon("mod/portal");
   	}
      
       public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
       {

       }
      
       public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
       {
             if (par5Entity.ridingEntity == null && par5Entity.riddenByEntity == null)
             {
                    if (par5Entity instanceof EntityPlayerMP)
                    {
                           EntityPlayerMP thePlayer = (EntityPlayerMP) par5Entity;
                           //If the dimension is 21 send us somewhere.
                           if (par5Entity.dimension == 20)
                           {
                                  //thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, mod_tutorial.dimensionID);
                                  MinecraftServer.getServer().getConfigurationManager().transferPlayerToDimension(thePlayer, 21, new EclipseTeleporter(thePlayer.getServerForPlayer())); 
                           }
                           else
                           {
                               // The number at the end is what number you want to go to if the number up top is == dimension your currently in. (-1 overworld, 0, nether, 1, end)  
                        	   thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, -1);
                           }
                    }
             }
       }
      
       public boolean tryToCreatePortal(World par1World, int par2, int par3, int par4)
    {
        byte b0 = 0;
        byte b1 = 0;

        if (par1World.getBlockId(par2 - 1, par3, par4) == ItemBlockHolder.EclipseBlock.blockID || par1World.getBlockId(par2 + 1, par3, par4) == ItemBlockHolder.EclipseBlock.blockID)
        {
            b0 = 1;
        }

        if (par1World.getBlockId(par2, par3, par4 - 1) == ItemBlockHolder.EclipseBlock.blockID || par1World.getBlockId(par2, par3, par4 + 1) == ItemBlockHolder.EclipseBlock.blockID)
        {
            b1 = 1;
        }

        if (b0 == b1)
        {
            return false;
        }
        else
        {
            //Might be dimension number at end(default is 0)
        	if (par1World.getBlockId(par2 - b0, par3, par4 - b1) == 0)
            {
                par2 -= b0;
                par4 -= b1;
            }

            int l;
            int i1;

            for (l = -1; l <= 2; ++l)
            {
                for (i1 = -1; i1 <= 3; ++i1)
                {
                    boolean flag = l == -1 || l == 2 || i1 == -1 || i1 == 3;

                    if (l != -1 && l != 2 || i1 != -1 && i1 != 3)
                    {
                        int j1 = par1World.getBlockId(par2 + b0 * l, par3 + i1, par4 + b1 * l);

                        if (flag)
                        {
                            if (j1 != ItemBlockHolder.EclipseBlock.blockID)
                            {
                                return false;
                            }
                        }
                        else if (j1 != 0 && j1 != ItemBlockHolder.ShineFire.blockID)
                        {
                            return false;
                        }
                    }
                }
            }

            for (l = 0; l < 2; ++l)
            {
                for (i1 = 0; i1 < 3; ++i1)
                {
                    par1World.setBlock(par2 + b0 * l, par3 + i1, par4 + b1 * l, ItemBlockHolder.EclipsePortal.blockID, 0, 2);
                }
            }

            return true;
        }
    }
      
       public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
       
    }
      
       public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5)
    {
        byte b0 = 0;
        byte b1 = 1;

        if (par1World.getBlockId(par2 - 1, par3, par4) == this.blockID || par1World.getBlockId(par2 + 1, par3, par4) == this.blockID)
        {
            b0 = 1;
            b1 = 0;
        }

        int i1;

        for (i1 = par3; par1World.getBlockId(par2, i1 - 1, par4) == this.blockID; --i1)
        {
            ;
        }

        if (par1World.getBlockId(par2, i1 - 1, par4) != ItemBlockHolder.EclipseBlock.blockID)
        {
            par1World.setBlockToAir(par2, par3, par4);
        }
        else
        {
            int j1;

            for (j1 = 1; j1 < 4 && par1World.getBlockId(par2, i1 + j1, par4) == this.blockID; ++j1)
            {
                ;
            }

            if (j1 == 3 && par1World.getBlockId(par2, i1 + j1, par4) == ItemBlockHolder.EclipseBlock.blockID)
            {
                boolean flag = par1World.getBlockId(par2 - 1, par3, par4) == this.blockID || par1World.getBlockId(par2 + 1, par3, par4) == this.blockID;
                boolean flag1 = par1World.getBlockId(par2, par3, par4 - 1) == this.blockID || par1World.getBlockId(par2, par3, par4 + 1) == this.blockID;

                if (flag && flag1)
                {
                    par1World.setBlockToAir(par2, par3, par4);
                }
                else
                {
                    if ((par1World.getBlockId(par2 + b0, par3, par4 + b1) != ItemBlockHolder.EclipseBlock.blockID || par1World.getBlockId(par2 - b0, par3, par4 - b1) != this.blockID) && (par1World.getBlockId(par2 - b0, par3, par4 - b1) != ItemBlockHolder.EclipseBlock.blockID || par1World.getBlockId(par2 + b0, par3, par4 + b1) != this.blockID))
                    {
                        par1World.setBlockToAir(par2, par3, par4);
                    }
                }
            }
            else
            {
                par1World.setBlockToAir(par2, par3, par4);
            }
        }
    }
}
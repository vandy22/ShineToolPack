package net.shinemod.configuration;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.registry.GameRegistry;

public class ConfigRecipeRegisters {
	@Init
	public static void RecipeRegisters(){
		GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.BasicCube,1), new Object[]{
			 "YBP", "W E", "LRG", 'Y',ItemBlockHolder.YellowIngot, 'B', ItemBlockHolder.BlackIngot, 'P', ItemBlockHolder.PurpleIngot, 'W', ItemBlockHolder.WhiteIngot, 'E', ItemBlockHolder.PinkIngot, 'L', ItemBlockHolder.BlueIngot, 'R', ItemBlockHolder.RedIngot, 'G', ItemBlockHolder.GreenIngot
			});
		
		GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.BlackWhiteMixedIngot, 1), new Object[]{
			" W ", " B ", " W ", 'W',ItemBlockHolder.WhiteIngot, 'B', ItemBlockHolder.BlackIngot
		});
		 
		GameRegistry.addShapelessRecipe(new ItemStack(Block.planks, 1), new ItemStack(ItemBlockHolder.ShineLogs));
		
		GameRegistry.addShapelessRecipe(new ItemStack(Block.planks, 4), new ItemStack(ItemBlockHolder.ShineLogs));
		
		 //blue
		 
		GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.TutorialHelmet,1), new Object[]{
			"TTT","TXT","   ",'T',ItemBlockHolder.BlueDust, 'X',ItemBlockHolder.WhiteHelmet
		});
		GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.TutorialPlate,1), new Object[]{
			"TXT","TTT","TTT",'T',ItemBlockHolder.BlueDust, 'X', ItemBlockHolder.WhitePlate
		});		
		GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.TutorialLegs,1), new Object[]{
			"TTT","TXT","T T",'T',ItemBlockHolder.BlueDust, 'X', ItemBlockHolder.WhiteLegs
		});		
		GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.TutorialBoots,1), new Object[]{
			"   ","TXT","T T",'T',ItemBlockHolder.BlueDust, 'X', ItemBlockHolder.WhiteBoots
		});
		//Yellow
		GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.YellowHelmet,1), new Object[]{
			"TTT","TXT","   ",'T',ItemBlockHolder.YellowDust, 'X',Item.helmetIron
		});
		GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.YellowPlate,1), new Object[]{
			"TXT","TTT","TTT",'T',ItemBlockHolder.YellowDust, 'X', Item.plateIron
		});		
		GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.YellowLegs,1), new Object[]{
			"TTT","TXT","T T",'T',ItemBlockHolder.YellowDust, 'X', Item.legsIron
		});		
		GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.YellowBoots,1), new Object[]{
			"   ","TXT","T T",'T',ItemBlockHolder.YellowDust, 'X', Item.bootsIron
		});
		//white
		GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.WhiteHelmet,1), new Object[]{
			"TTT","TXT","   ",'T',ItemBlockHolder.WhitePowder, 'X',ItemBlockHolder.YellowHelmet
		});
		GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.WhitePlate,1), new Object[]{
			"TXT","TTT","TTT",'T',ItemBlockHolder.WhitePowder, 'X', ItemBlockHolder.YellowPlate
		});		
		GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.WhiteLegs,1), new Object[]{
			"TTT","TXT","T T",'T',ItemBlockHolder.WhitePowder, 'X', ItemBlockHolder.YellowLegs
		});		
		GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.WhiteBoots,1), new Object[]{
			"   ","TXT","T T",'T',ItemBlockHolder.WhitePowder, 'X', ItemBlockHolder.YellowBoots
		});
		//red
		GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.RedHelmet,1), new Object[]{
			"TTT","TXT","   ",'T',ItemBlockHolder.RedDust, 'X',ItemBlockHolder.TutorialHelmet
		});
		GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.RedPlate,1), new Object[]{
			"TXT","TTT","TTT",'T',ItemBlockHolder.RedDust, 'X', ItemBlockHolder.TutorialPlate
		});		
		GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.RedLegs,1), new Object[]{
			"TTT","TXT","T T",'T',ItemBlockHolder.RedDust, 'X', ItemBlockHolder.TutorialLegs
		});		
		GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.RedBoots,1), new Object[]{
			"   ","TXT","T T",'T',ItemBlockHolder.RedDust, 'X', ItemBlockHolder.TutorialBoots
		});
		//green
		GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.GreenHelmet,1), new Object[]{
			"TTT","TXT","   ",'T',ItemBlockHolder.GreenDust, 'X', ItemBlockHolder.RedHelmet
		});
		GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.GreenPlate,1), new Object[]{
			"TXT","TTT","TTT",'T',ItemBlockHolder.GreenDust, 'X', ItemBlockHolder.RedPlate
		});		
		GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.GreenLegs,1), new Object[]{
			"TTT","TXT","T T",'T',ItemBlockHolder.GreenDust, 'X', ItemBlockHolder.RedLegs
		});		
		GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.GreenBoots,1), new Object[]{
			"   ","TXT","T T",'T',ItemBlockHolder.GreenDust, 'X', ItemBlockHolder.RedBoots
		});
		//pink
		GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.PinkHelmet,1), new Object[]{
			"TTT","TXT","   ",'T',ItemBlockHolder.PinkDust, 'X',ItemBlockHolder.GreenHelmet
		});
		GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.PinkPlate,1), new Object[]{
			"TXT","TTT","TTT",'T',ItemBlockHolder.PinkDust, 'X', ItemBlockHolder.GreenPlate
		});		
		GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.PinkLegs,1), new Object[]{
			"TTT","TXT","T T",'T',ItemBlockHolder.PinkDust, 'X', ItemBlockHolder.GreenLegs
		});		
		GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.PinkBoots,1), new Object[]{
			"   ","TXT","T T",'T',ItemBlockHolder.PinkDust, 'X', ItemBlockHolder.GreenBoots
		});
		//purple
		GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.PurpleHelmet,1), new Object[]{
			"TTT","TXT","   ",'T',ItemBlockHolder.PurpleDust, 'X',ItemBlockHolder.PinkHelmet
		});
		GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.PurplePlate,1), new Object[]{
			"TXT","TTT","TTT",'T',ItemBlockHolder.PurpleDust, 'X', ItemBlockHolder.PinkPlate
		});		
		GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.PurpleLegs,1), new Object[]{
			"TTT","TXT","T T",'T',ItemBlockHolder.PurpleDust, 'X', ItemBlockHolder.PinkLegs
		});		
		GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.PurpleBoots,1), new Object[]{
			"   ","TXT","T T",'T',ItemBlockHolder.PurpleDust, 'X', ItemBlockHolder.PinkBoots
		});
		//black
		GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.BlackHelmet,1), new Object[]{
			"TTT","TXT","   ",'T',ItemBlockHolder.BlackDust, 'X',ItemBlockHolder.PurpleHelmet
		});
		GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.BlackPlate,1), new Object[]{
			"TXT","TTT","TTT",'T',ItemBlockHolder.BlackDust, 'X', ItemBlockHolder.PurplePlate
		});		
		GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.BlackLegs,1), new Object[]{
			"TTT","TXT","T T",'T',ItemBlockHolder.BlackDust, 'X', ItemBlockHolder.PurpleLegs
		});		
		GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.BlackBoots,1), new Object[]{
			"   ","TXT","T T",'T',ItemBlockHolder.BlackDust, 'X', ItemBlockHolder.PurpleBoots
		});
		//Rainbow
		GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.RainbowHelmet,1), new Object[]{
			"TTT","TXT","   ",'T',ItemBlockHolder.RainbowDust, 'X',ItemBlockHolder.BlackWhiteHelmet
		});
		GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.RainbowPlate,1), new Object[]{
			"TXT","TTT","TTT",'T',ItemBlockHolder.RainbowDust, 'X', ItemBlockHolder.BlackWhitePlate
		});		
		GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.RainbowLegs,1), new Object[]{
			"TTT","TXT","T T",'T',ItemBlockHolder.RainbowDust, 'X', ItemBlockHolder.BlackWhiteLegs
		});		
		GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.RainbowBoots,1), new Object[]{
			"   ","TXT","T T",'T',ItemBlockHolder.RainbowDust, 'X', ItemBlockHolder.BlackWhiteBoots
		});
		//Black/White
		GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.BlackWhiteHelmet,1), new Object[]{
			"TTT","TXT","   ",'T',ItemBlockHolder.BlackWhiteDust, 'X',ItemBlockHolder.BlackHelmet
		});
		GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.BlackWhitePlate,1), new Object[]{
			"TXT","TTT","TTT",'T',ItemBlockHolder.BlackWhiteDust, 'X', ItemBlockHolder.BlackPlate
		});		
		GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.BlackWhiteLegs,1), new Object[]{
			"TTT","TXT","T T",'T',ItemBlockHolder.BlackWhiteDust, 'X', ItemBlockHolder.BlackLegs
		});		
		GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.BlackWhiteBoots,1), new Object[]{
			"   ","TXT","T T",'T',ItemBlockHolder.BlackWhiteDust, 'X', ItemBlockHolder.BlackBoots
		});
		
		  //Sword out of YellowIngot
		 GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.YellowSword, 1), new Object[]{
		 " * ", " X ",
		 'X', Item.swordIron, '*', ItemBlockHolder.YellowToolFragment
		 });
		 
		 //Pickaxe out of YellowIngot
		 GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.YellowPickaxe, 1), new Object[]{
		 " * ", " X ",
		 'X', Item.pickaxeIron, '*', ItemBlockHolder.YellowToolFragment
		 });

		 //Axe out of YellowIngot
		 GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.YellowAxe, 1), new Object[]{
		 " * ", " X ",
		 'X', Item.axeIron, '*', ItemBlockHolder.YellowToolFragment
		 });
		 
		 //Spade out of Yellow Ingot
		 GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.YellowSpade), new Object[]{
		 " * ", " X ",
		 'X', Item.shovelIron, '*', ItemBlockHolder.YellowToolFragment
		 });

		 //Yellow Tool Fragment
		 GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.YellowToolFragment, 1), new Object[]{
		 "***", " * ",
		 '*', ItemBlockHolder.YellowIngot
		 });
		 
		 //WHITE
		 
		 //WhitePowder out of Dust
		 GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.WhitePowder), new Object[]{
		 "**", "*X",
		 '*', ItemBlockHolder.YellowDust, 'X', ItemBlockHolder.SilverDust
		 });
		 
		 //Sword out of White Ingot
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.WhiteSword, 1), new Object[]{
		  " * ", " X ",
		  'X', ItemBlockHolder.YellowSword, '*', ItemBlockHolder.WhiteToolFragment
		  });
		  
		  //Yellow out of White Ingot
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.WhitePickaxe, 1), new Object[]{
		  " * ", " X ",
		  'X', ItemBlockHolder.YellowPickaxe, '*', ItemBlockHolder.WhiteToolFragment
		  });
		  
		  //Axe out of White Ingot
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.WhiteAxe, 1), new Object[]{
		  " * ", " X ",
		  'X', ItemBlockHolder.YellowAxe, '*', ItemBlockHolder.WhiteToolFragment
		  });

		  //Spade out of White Ingot
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.WhiteSpade, 1), new Object[]{
		  " * ", " X ",
		  'X', ItemBlockHolder.YellowSpade, '*', ItemBlockHolder.WhiteToolFragment
		  });
		  
		  //White Tool Fragment
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.WhiteToolFragment, 1), new Object[]{
		  "***", " * ",
		  '*', ItemBlockHolder.WhiteIngot
		  });
		  
		  //BLUE
		  
		  //Sword out of Blue Ingot
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.BlueSword, 1), new Object[]{
		  " * ", " X ",
		  'X', ItemBlockHolder.WhiteSword, '*', ItemBlockHolder.BlueToolFragment
		  });
		  
		  //Yellow out of Blue Ingot
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.BluePickaxe, 1), new Object[]{
		  " * ", " X ",
		  'X', ItemBlockHolder.WhitePickaxe, '*', ItemBlockHolder.BlueToolFragment
		  });

		  //Spade out of Blue Ingot
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.BlueSpade, 1), new Object[]{
		  " * ", " X ",
		  'X', ItemBlockHolder.WhiteSpade, '*', ItemBlockHolder.BlueToolFragment
		  });;
		 
		  //Axe out of Blue Ingot
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.BlueAxe, 1), new Object[]{
		  " * ", " X ",
		  'X', ItemBlockHolder.WhiteAxe, '*', ItemBlockHolder.BlueToolFragment
		  });
		 
			  
		  //Blue Tool Fragment
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.BlueToolFragment, 1), new Object[]{
		  "***", " * ",
		  '*', ItemBlockHolder.BlueIngot
		  });
			  
		  
			  
			  
		  //RED  
			  
		  //Axe out of Red Ingot
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.RedAxe, 1), new Object[]{
		  " * ", " X ",
		  'X', ItemBlockHolder.BlueAxe, '*', ItemBlockHolder.RedToolFragment
		  });  

		  //Yellow out of Red Ingot
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.RedPickaxe, 1), new Object[]{
		  " * ", " X ",
		  'X', ItemBlockHolder.BluePickaxe, '*', ItemBlockHolder.RedToolFragment
		  });  
		  
		  //Sword out of Red Ingot
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.RedSword, 1), new Object[]{
		  " * ", " X ",
		  'X', ItemBlockHolder.BlueSword, '*', ItemBlockHolder.RedToolFragment
		  }); 
		  
		  
		  //Spade out of Red Ingot
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.RedSpade, 1), new Object[]{
		  " * ", " X ",
		  'X', ItemBlockHolder.BlueSpade, '*', ItemBlockHolder.RedToolFragment
		  });
		  
		  
		  //Red Tool Fragment
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.RedToolFragment, 1), new Object[]{
		  "***", " * ",
		  '*', ItemBlockHolder.RedIngot
		  });
		  
		  //Green
		  
		  //Axe out of Green Ingot
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.GreenAxe, 1), new Object[]{
		  " * ", " X ",
		  'X', ItemBlockHolder.RedAxe, '*', ItemBlockHolder.GreenToolFragment
		  });  

		  //Yellow out of Green Ingot
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.GreenPickaxe, 1), new Object[]{
		  " * ", " X ",
		  'X', ItemBlockHolder.RedPickaxe, '*', ItemBlockHolder.GreenToolFragment
		  });  
		  
		  //Sword out of Green Ingot
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.GreenSword, 1), new Object[]{
		  " * ", " X ",
		  'X', ItemBlockHolder.RedSword, '*', ItemBlockHolder.GreenToolFragment
		  }); 
		  
		  
		  //Spade out of Green Ingot
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.GreenSpade, 1), new Object[]{
		  " * ", " X ",
		  'X', ItemBlockHolder.RedSpade, '*', ItemBlockHolder.GreenToolFragment
		  });
		  
		  
		  //Green Tool Fragment
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.GreenToolFragment, 1), new Object[]{
		  "***", " * ",
		  '*', ItemBlockHolder.GreenIngot
		  });
		  
		  //Pink
		  
		  //Axe out of Pink Ingot
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.PinkAxe, 1), new Object[]{
		  " * ", " X ",
		  'X', ItemBlockHolder.GreenAxe, '*', ItemBlockHolder.PinkToolFragment
		  });  

		  //Yellow out of Pink Ingot
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.PinkPickaxe, 1), new Object[]{
		  " * ", " X ",
		  'X', ItemBlockHolder.GreenPickaxe, '*', ItemBlockHolder.PinkToolFragment
		  });  
		  
		  //Sword out of Pink Ingot
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.PinkSword, 1), new Object[]{
		  " * ", " X ",
		  'X', ItemBlockHolder.GreenSword, '*', ItemBlockHolder.PinkToolFragment
		  }); 
		  
		  
		  //Spade out of Pink Ingot
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.PinkSpade, 1), new Object[]{
		  " * ", " X ",
		  'X', ItemBlockHolder.GreenSpade, '*', ItemBlockHolder.PinkToolFragment
		  });
		  
		  
		  //Pink Tool Fragment
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.PinkToolFragment, 1), new Object[]{
		  "***", " * ",
		  '*', ItemBlockHolder.PinkIngot
		  });
		  
		  
		  
		  //Purple
		  
		  //Axe out of Purple Ingot
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.PurpleAxe, 1), new Object[]{
		  " * ", " X ",
		  'X', ItemBlockHolder.PinkAxe, '*', ItemBlockHolder.PurpleToolFragment
		  });  

		  //Yellow out of Purple Ingot
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.PurplePickaxe, 1), new Object[]{
		  " * ", " X ",
		  'X', ItemBlockHolder.PinkPickaxe, '*', ItemBlockHolder.PurpleToolFragment
		  });  
		  
		  //Sword out of Purple Ingot
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.PurpleSword, 1), new Object[]{
		  " * ", " X ",
		  'X', ItemBlockHolder.PinkSword, '*', ItemBlockHolder.PurpleToolFragment
		  }); 
		  
		  
		  //Spade out of Purple Ingot
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.PurpleSpade, 1), new Object[]{
		  " * ", " X ",
		  'X', ItemBlockHolder.PinkSpade, '*', ItemBlockHolder.PurpleToolFragment
		  });
		  
		  
		  //Purple Tool Fragment
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.PurpleToolFragment, 1), new Object[]{
		  "***", " * ",
		  '*', ItemBlockHolder.PurpleIngot
		  });
		  
		  //Black
		  
		  //Axe out of Black Ingot
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.BlackAxe, 1), new Object[]{
		  " * ", " X ",
		  'X', ItemBlockHolder.PurpleAxe, '*', ItemBlockHolder.BlackToolFragment
		  });  

		  //Yellow out of Black Ingot
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.BlackPickaxe, 1), new Object[]{
		  " * ", " X ",
		  'X', ItemBlockHolder.PurplePickaxe, '*', ItemBlockHolder.BlackToolFragment
		  });  
		  
		  //Sword out of Black Ingot
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.BlackSword, 1), new Object[]{
		  " * ", " X ",
		  'X', ItemBlockHolder.PurpleSword, '*', ItemBlockHolder.BlackToolFragment
		  }); 
		  
		  
		  //Spade out of Black Ingot
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.BlackSpade, 1), new Object[]{
		  " * ", " X ",
		  'X', ItemBlockHolder.PurpleSpade, '*', ItemBlockHolder.BlackToolFragment
		  });
		  
		  
		  //Black Tool Fragment
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.BlackToolFragment, 1), new Object[]{
		  "***", " * ",
		  '*', ItemBlockHolder.BlackIngot
		  });
		  
		  //Black/White
		  
		  //Axe out of BlackWhite Ingot
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.BlackWhiteAxe, 1), new Object[]{
		  " * ", " X ",
		  'X', ItemBlockHolder.BlackWhiteAxe, '*', ItemBlockHolder.BlackWhiteToolFragment
		  });  

		  //Yellow out of BlackWhite Ingot
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.BlackWhitePickaxe, 1), new Object[]{
		  " * ", " X ",
		  'X', ItemBlockHolder.BlackWhitePickaxe, '*', ItemBlockHolder.BlackWhiteToolFragment
		  });  
		  
		  //Sword out of BlackWhite Ingot
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.BlackWhiteSword, 1), new Object[]{
		  " * ", " X ",
		  'X', ItemBlockHolder.BlackWhiteSword, '*', ItemBlockHolder.BlackWhiteToolFragment
		  }); 
		  
		  
		  //Spade out of BlackWhite Ingot
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.BlackWhiteSpade, 1), new Object[]{
		  " * ", " X ",
		  'X', ItemBlockHolder.BlackWhiteSpade, '*', ItemBlockHolder.BlackWhiteToolFragment
		  });
		  
		  
		  //BlackWhite Tool Fragment
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.BlackWhiteToolFragment, 1), new Object[]{
		  "***", " * ",
		  '*', ItemBlockHolder.BlackWhiteIngot
		  });
		  
		  //Rainbow
		  
		  //Axe out of Rainbow Ingot
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.RainbowAxe, 1), new Object[]{
		  " * ", " X ",
		  'X', ItemBlockHolder.BlackWhiteAxe, '*', ItemBlockHolder.RainbowToolFragment
		  });
		  
		  

		  //Yellow out of Rainbow Ingot
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.RainbowPickaxe, 1), new Object[]{
		  " * ", " X ",
		  'X', ItemBlockHolder.BlackWhitePickaxe, '*', ItemBlockHolder.RainbowToolFragment
		  });  
		  
		  //Sword out of Rainbow Ingot
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.RainbowSword, 1), new Object[]{
		  " * ", " X ",
		  'X', ItemBlockHolder.BlackWhiteSword, '*', ItemBlockHolder.RainbowToolFragment
		  });
		  
		  //Spade out of Rainbow Ingot
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.RainbowSpade, 1), new Object[]{
		  " * ", " X ",
		  'X', ItemBlockHolder.BlackWhiteSpade, '*', ItemBlockHolder.RainbowToolFragment
		  });
		  
		  
		  //Rainbow Tool Fragment
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.RainbowToolFragment, 1), new Object[]{
		  "***", " * ",
		  '*', ItemBlockHolder.RainbowIngot
		  });
		  
		  //BlueBlock
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.BlueBlock, 1), new Object[]{
		  "**", "**", '*', ItemBlockHolder.BlueIngot
		  });
		  
		  //YellowBlock
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.YellowBlock, 1), new Object[]{
		  "**", "**", '*', ItemBlockHolder.YellowIngot
		  });
		  
		  //WhiteBlock
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.WhiteBlock, 1), new Object[]{
		  "**", "**", '*', ItemBlockHolder.WhiteIngot
		  });
		  
		  //RedBlock
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.RedBlock, 1), new Object[]{
		  "**", "**", '*', ItemBlockHolder.RedIngot
		  });
		  
		  //GreenBlock
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.GreenBlock, 1), new Object[]{
		  "**", "**", '*', ItemBlockHolder.GreenIngot
		  });
		  
		 //PurpleBlock
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.PurpleBlock, 1), new Object[]{
		  "**", "**", '*', ItemBlockHolder.PurpleIngot
		  });
		  
		  //BlackBlock
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.BlackBlock, 1), new Object[]{
		  "**", "**", '*', ItemBlockHolder.BlackIngot
		  });
		  
		  //RainbowBlock
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.RainbowBlock, 1), new Object[]{
		  "**", "**", '*', ItemBlockHolder.RainbowIngot
		  });
		  
		  //BluePaxel
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.BluePaxel, 1), new Object[]{
			  "ASP", " D ", " B ", 'A', ItemBlockHolder.BlueAxe, 'S', ItemBlockHolder.BlueSword, 'P', ItemBlockHolder.BluePickaxe, 'D', ItemBlockHolder.BlueSpade, 'B', ItemBlockHolder.Blazer
			  });
		  
		  //RedPaxel
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.RedPaxel, 1), new Object[]{
			  "ASP", " D ", " B ", 'A', ItemBlockHolder.RedAxe, 'S', ItemBlockHolder.RedSword, 'P', ItemBlockHolder.RedPickaxe, 'D', ItemBlockHolder.RedSpade, 'B', ItemBlockHolder.Blazer
			  });
		  
		  //GreenPaxel
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.GreenPaxel, 1), new Object[]{
			  "ASP", " D ", " B ", 'A', ItemBlockHolder.GreenAxe, 'S', ItemBlockHolder.GreenSword, 'P', ItemBlockHolder.GreenPickaxe, 'D', ItemBlockHolder.GreenSpade, 'B', ItemBlockHolder.Blazer
			  });
		  
		  //PinkPaxel
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.PinkPaxel, 1), new Object[]{
			  "ASP", " D ", " B ", 'A', ItemBlockHolder.PinkAxe, 'S', ItemBlockHolder.PinkSword, 'P', ItemBlockHolder.PinkPickaxe, 'D', ItemBlockHolder.PinkSpade, 'B', ItemBlockHolder.Blazer
			  });
		  
		  //PurplePaxel
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.PurplePaxel, 1), new Object[]{
			  "ASP", " D ", " B ", 'A', ItemBlockHolder.PurpleAxe, 'S', ItemBlockHolder.PurpleSword, 'P', ItemBlockHolder.PurplePickaxe, 'D', ItemBlockHolder.PurpleSpade, 'B', ItemBlockHolder.Blazer
			  });
		  
		  //BlackPaxel
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.BlackPaxel, 1), new Object[]{
			  "ASP", " D ", " B ", 'A', ItemBlockHolder.BlackAxe, 'S', ItemBlockHolder.BlackSword, 'P', ItemBlockHolder.BlackPickaxe, 'D', ItemBlockHolder.BlackSpade, 'B', ItemBlockHolder.Blazer
			  });
		  
		  //BlackWhitePaxel
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.BlackWhitePaxel, 1), new Object[]{
			  "ASP", " D ", " B ", 'A', ItemBlockHolder.BlackWhiteAxe, 'S', ItemBlockHolder.BlackWhiteSword, 'P', ItemBlockHolder.BlackWhitePickaxe, 'D', ItemBlockHolder.BlackWhiteSpade, 'B', ItemBlockHolder.Blazer
			  });
		  
		  //RainbowPaxel
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.RainbowPaxel, 1), new Object[]{
			  "ASP", " D ", " B ", 'A', ItemBlockHolder.RainbowAxe, 'S', ItemBlockHolder.RainbowSword, 'P', ItemBlockHolder.RainbowPickaxe, 'D', ItemBlockHolder.RainbowSpade, 'B', ItemBlockHolder.Blazer
			  });
		  
		 
		  
		  
		  //Blazer
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.Blazer, 1), new Object[]{
			  " D ", " L ", " D ", 'D', Item.diamond, 'L', Item.bucketLava
			  });
		  //Shiner
		  GameRegistry.addRecipe(new ItemStack(ItemBlockHolder.Shiner, 1), new Object[]{
			  "RGR", "FDF", "RGR", 'D', Item.diamond, 'R', Item.redstone, 'F', Item.flintAndSteel, 'G', Item.ingotGold
			  });
	}
}

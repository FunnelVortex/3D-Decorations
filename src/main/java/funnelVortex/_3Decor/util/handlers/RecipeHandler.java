package funnelVortex._3Decor.util.handlers;

import funnelVortex._3Decor.init.BlockInit;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeHandler 
{
	public static void registerCrafting()
	{
		GameRegistry.addShapedRecipe(new ResourceLocation("decor:block_solarlight"), new ResourceLocation("decor:blocks"), new ItemStack(BlockInit.BLOCK_SOLARLIGHT, 8), 
				new Object[] 
						{"D", 
						 "R",
						 "S", 
						 'D', Blocks.DAYLIGHT_DETECTOR, 'R', Blocks.REDSTONE_LAMP, 'S', Blocks.STONE});
	}
}

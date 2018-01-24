package funnelVortex._3Decor.util.handlers;

import funnelVortex._3Decor.init.BlockInit;
import funnelVortex._3Decor.init.ItemInit;
import net.minecraft.client.gui.recipebook.RecipeList;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@EventBusSubscriber
public class RecipeHandler 
{
	private static ResourceLocation resourceLocation = new ResourceLocation("decor:blocks");
	
	@SubscribeEvent
	public static void registerCrafting(RegistryEvent.Register<IRecipe> event)
	{
		// Crafting recipe for the solar light. 
		GameRegistry.addShapedRecipe(new ResourceLocation("decor:block_solarlight"), resourceLocation, new ItemStack(BlockInit.BLOCK_SOLARLIGHT, 8), 
						 "D", 
						 "R",
						 "S", 
						 'D', Blocks.DAYLIGHT_DETECTOR, 'R', Blocks.REDSTONE_LAMP, 'S', Blocks.STONE);
		
		GameRegistry.addShapedRecipe(new ResourceLocation("decor:block_tvantenna"), resourceLocation, new ItemStack(BlockInit.BLOCK_TVANTENNA), 
			    "BBB", 
			         " I ",
			         " I ", 
			    'I', Items.IRON_INGOT, 'B', Blocks.IRON_BARS);
		
		GameRegistry.addShapedRecipe(new ResourceLocation("decor:block_lightningrod"), resourceLocation, new ItemStack(BlockInit.BLOCK_LIGHTNINGROD), 
						"I", 
						 "I",
						 "R", 
						 'I', Items.IRON_INGOT, 'R', Blocks.REDSTONE_BLOCK);
		
		GameRegistry.addShapedRecipe(new ResourceLocation("decor:block_largepot"), resourceLocation, new ItemStack(BlockInit.BLOCK_LARGEPOT), 
				"BDB", 
				 "BDB",
				 "BBB", 
				 'D', Blocks.DIRT, 'B', Items.BRICK);
		
		GameRegistry.addShapedRecipe(new ResourceLocation("decor:block_woodboards"), resourceLocation, new ItemStack(BlockInit.BLOCK_WOODBOARDS, 6), 
				"SSS", 
				 "SSS",
				 'S', Blocks.WOODEN_SLAB);
		
		GameRegistry.addShapedRecipe(new ResourceLocation("decor:lavalamp_base"), resourceLocation, new ItemStack(ItemInit.LAVALAMP_BASE), 
				"IGI", 
				 " I ",
				 "III", 
				 'I', Items.IRON_NUGGET, 'G', Items.GLOWSTONE_DUST);
		
		GameRegistry.addShapedRecipe(new ResourceLocation("decor:lavalamp_body"), resourceLocation, new ItemStack(ItemInit.LAVALAMP_BODY), 
				" G ", 
				 "GLG",
				 "GGG", 
				 'G', Blocks.GLASS_PANE, 'L', Items.LAVA_BUCKET);
		
		GameRegistry.addShapedRecipe(new ResourceLocation("decor:lavalamp_cap"), resourceLocation, new ItemStack(ItemInit.LAVALAMP_CAP), 
				" I ", 
				 "I I",
				 "I I",
				 'I', Items.IRON_NUGGET);
		
		GameRegistry.addShapedRecipe(new ResourceLocation("decor:block_lavalamp"), resourceLocation, new ItemStack(BlockInit.BLOCK_LAVALAMP), 
				"C", 
				 "B",
				 "A",
				 'A', ItemInit.LAVALAMP_BASE, 'B', ItemInit.LAVALAMP_BODY, 'C', ItemInit.LAVALAMP_CAP);
	}
}

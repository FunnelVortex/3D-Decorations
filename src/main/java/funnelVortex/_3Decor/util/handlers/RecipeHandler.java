package funnelVortex._3Decor.util.handlers;

import funnelVortex._3Decor.init.BlockInit;
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
	}
}

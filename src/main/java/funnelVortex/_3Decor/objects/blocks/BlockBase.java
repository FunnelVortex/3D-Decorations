package funnelVortex._3Decor.objects.blocks;

import funnelVortex._3Decor._3Decor;
import funnelVortex._3Decor.init.BlockInit;
import funnelVortex._3Decor.init.ItemInit;
import funnelVortex._3Decor.proxy.ClientProxy;
import funnelVortex._3Decor.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.event.world.BlockEvent.PlaceEvent;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BlockBase extends Block implements IHasModel
{
	// The block position.
	public BlockPos position;

	// Initializes a new instance of the BlockBase class.
	public BlockBase(String name, Material material) 
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.DECORATIONS);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	// Registers block models.
	@Override
	public void registerModels() 
	{
		_3Decor.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}	
	
	@Override
	public boolean isOpaqueCube(IBlockState blockState) 
	{
		return false;
	}
	
	@Override
	public boolean isFullCube(IBlockState blockstate) {
		return false;
	}
}

package funnelVortex._3Decor.objects.blocks;

import funnelVortex._3Decor._3Decor;
import funnelVortex._3Decor.objects.blocks.counter.TileEntityCounter;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.storage.WorldInfo;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.event.world.BlockEvent.PlaceEvent;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

// A new instance of the solarlight class.
public class SolarLight extends BlockTileEntity<TileEntityNightLight> 
{	
	BlockPos pos;
	
	// The tile entity that lights up at night.
	private TileEntityNightLight tile;
	
	// Initialized a new instance of the SolarLight class.
	public SolarLight() {
		super("block_solarlight", Material.ROCK);		
		this.blockHardness=1;		
	}
	
	// Gets rid of XRay effect under model.
	@Override
	public boolean isOpaqueCube(IBlockState blockState) 
	{
		return false;
	}
	
	// Activates the tile entity when the block is placed by the player.
	@Override
	public void onBlockPlacedBy(World world, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack)
	{
		this.position = pos;
		// Gets the tile entity variable.
		tile = getTileEntity(world, pos);	
		
		// Passes in info about the world and block position for the light to use to detect light cycles and sky exposure.
		tile.setLight(world, pos, placer);	
	}		
	
	// Makes the block walk throughable
	@Override
	public boolean isPassable(IBlockAccess world, BlockPos pos) 
	{
		return true;
	}
	
	// This override will be for removing the stuck tile entity after removing the block.
	@Override
    public boolean removedByPlayer(IBlockState state, World world, BlockPos pos, EntityPlayer player, boolean willHarvest)
    {
        this.onBlockHarvested(world, pos, state, player);
        return world.setBlockState(pos, net.minecraft.init.Blocks.AIR.getDefaultState(), world.isRemote ? 11 : 3);
        
        // Code to remove tile entity stuck in world will go here.
    }

	// Gets the tile entity class on registration.
	@Override
	public Class getTileEntityClass() {
		return TileEntityNightLight.class;
	}

	// Creates the tile entity on registration.
	@Override
	public TileEntityNightLight createTileEntity(World world, IBlockState state) {
		return new TileEntityNightLight(this, world);
	}
}

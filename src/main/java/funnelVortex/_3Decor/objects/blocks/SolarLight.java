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
	
	// On when block is activated.
	@Override
	public void onBlockPlacedBy(World world, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack)
	{
		//if (!world.isRemote)
		//{
			TileEntityNightLight tile = getTileEntity(world, pos);
			tile.setInfo(world, pos);
			// tile.update();
		//}		
	}
	
	@Override
	public boolean isPassable(IBlockAccess world, BlockPos pos) 
	{
		return true;
	}

	@Override
	public Class getTileEntityClass() {
		// TODO Auto-generated method stub
		return TileEntityNightLight.class;
	}

	@Override
	public TileEntityNightLight createTileEntity(World world, IBlockState state) {
		// TODO Auto-generated method stub
		return new TileEntityNightLight(this);
	}
}

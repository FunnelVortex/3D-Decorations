package funnelVortex._3Decor.objects.blocks.counter;

import javax.annotation.Nullable;

import funnelVortex._3Decor.objects.blocks.BlockTileEntity;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class BlockCounter extends BlockTileEntity<TileEntityCounter>
{
	public BlockCounter()
	{
		super("counter", Material.ROCK);
	}
	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ) 
	{
		if (!world.isRemote)
		{
			TileEntityCounter tile = getTileEntity(world, pos);
			if (side == EnumFacing.DOWN)
			{
				tile.decrementCount();
			}
			else if (side == EnumFacing.UP)
			{
				tile.incrementCount();
			}
			player.sendMessage(new TextComponentString("Count: " + tile.getCount()));
		}
		
		return true;
	}
	
	@Override
	public Class<TileEntityCounter> getTileEntityClass()
	{
		return TileEntityCounter.class;
	}
	
	@Override
	@Nullable
	public TileEntityCounter createTileEntity(World world, IBlockState state)
	{
		return new TileEntityCounter();
	}
}

package funnelVortex._3Decor.objects.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class TvAntenna extends BlockBase
{
	public TvAntenna() {
		super("block_tvantenna", Material.IRON);
		this.setHardness(1);
	}
	
	@Override
	public boolean isPassable(IBlockAccess world, BlockPos pos) 
	{
		return true;
	}
}

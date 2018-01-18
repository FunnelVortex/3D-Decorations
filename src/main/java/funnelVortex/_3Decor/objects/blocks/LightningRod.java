package funnelVortex._3Decor.objects.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class LightningRod extends BlockBase
{
	public LightningRod() {
		super("block_lightningrod", Material.IRON);
	}
	
	@Override
	public boolean isPassable(IBlockAccess world, BlockPos pos) 
	{
		return true;
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState blockState) 
	{
		return false;
	}
}

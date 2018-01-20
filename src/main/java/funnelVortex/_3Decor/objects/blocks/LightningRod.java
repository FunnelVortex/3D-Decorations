package funnelVortex._3Decor.objects.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class LightningRod extends BlockTileEntity<TileEntityLightningRod>
{
	private TileEntityLightningRod tile;
	
	public LightningRod() {
		super("block_lightningrod", Material.IRON);
	}
	
	@Override
	public boolean isPassable(IBlockAccess world, BlockPos pos) 
	{
		return true;
	}
	
	// Activates the tile entity when the block is placed by the player.
	@Override
	public void onBlockPlacedBy(World world, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack)
	{
		this.tile = getTileEntity(world, pos);	
		
		this.tile.setPosition(pos);	
	}		

	@Override
	public Class<TileEntityLightningRod> getTileEntityClass() {
		// TODO Auto-generated method stub
		return TileEntityLightningRod.class;
	}

	@Override
	public TileEntityLightningRod createTileEntity(World world, IBlockState state) {
		return new TileEntityLightningRod(world, state);
	}
}

package funnelVortex._3Decor.objects.blocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TileEntityLightningRod extends TileEntity implements ITickable
{
	private World currentWorld;
	
	private IBlockState blockState;
	
	private BlockPos pos;
	
	public TileEntityLightningRod(World world, IBlockState state) {
		currentWorld = world;
		blockState = state;
	}
	
	public void setPosition(BlockPos position) {
		pos = position;
	}
	
	@Override
	public void update() {
	if (world.getTotalWorldTime() % 200 == 0)
		if (currentWorld.isThundering() == true && this.pos != null) {
			world.addWeatherEffect(new EntityLightningBolt(currentWorld, pos.getX(), pos.getY(), pos.getZ(), false));
		}	
	}	
}

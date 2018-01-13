package funnelVortex._3Decor.objects.blocks;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TileEntityNightLight extends TileEntity implements ITickable
{
	private World world;
	
	private BlockPos pos;
	
	//Light
	private BlockTileEntity light;
	
	public TileEntityNightLight(BlockTileEntity light)
	{
		this.light = light;
	}
	
	//Updates the world time regularly.
	private long updateWorldTime(World world) 
	{
		return world.getWorldTime();
	}
	
	// Checks to see if a block is overhead.
	private boolean checkIfBlockOverhead(World world, BlockPos pos) 
	{		
		return world.canBlockSeeSky(pos);
	}
	
	// Sets the light level of the block based on time of Minecraft day in ticks.
	private void setLightBasedOnTime(long time) 
	{
		if (time > 0 && time < 12500) 
		{
			light.setLightLevel(0F);
			light.setLightOpacity(0);
		}
		else 
		{
			light.setLightLevel(18F);
			light.setLightOpacity(15);
		}	
	}
	
	// Handles the light events.
	public void setInfo(World world, BlockPos pos)
	{	
		this.world = world;
		
		this.pos = pos;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		long time = this.updateWorldTime(world);
		
		if (this.checkIfBlockOverhead(world, pos) == true) 
		{
			this.setLightBasedOnTime(time);
		}
		else 
		{
			light.setLightLevel(0F);
			light.setLightOpacity(0);
		}		
	}
}

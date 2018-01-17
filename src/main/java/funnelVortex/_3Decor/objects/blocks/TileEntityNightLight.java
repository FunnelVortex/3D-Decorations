package funnelVortex._3Decor.objects.blocks;


import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class TileEntityNightLight extends TileEntity implements ITickable
{
	// The world.
	// private World world;
	
	// Position of the block.
	// private BlockPos pos;
	
	private long worldTime;
	
	private EntityPlayer player;
	
	// The block itself.
	private BlockTileEntity light;
	
	// Constructor which uses the passed in block for the tile entity to enact upon.
	public TileEntityNightLight(BlockTileEntity light, World world)
	{
		this.light = light;		
	}
	
	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound)
	{
		compound.setLong("time", world.getWorldTime());
		return super.writeToNBT(compound);
	}
	
	@Override
	public void readFromNBT(NBTTagCompound compound)
	{
		worldTime = compound.getLong("time");
		super.readFromNBT(compound);
	}
	
	// Updates the world time regularly.
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
	private void setLightBasedOnTime() 
	{
		// Detects if the time of day is after 12500 ticks.
		// The light will turn on a little before sunset and off a little after sunrise.
		if (world.isDaytime() == true) 
		{
			light.setLightLevel(0F);
			light.setLightOpacity(0);
		}
		else if (world.isDaytime() == false)
		{
			// Better than torches!
			light.setLightLevel(18F);
			light.setLightOpacity(15);
		}	
	}
	
	// Sets info the block needs to work.
	public void setLight(World world, BlockPos pos, EntityLivingBase placer)
	{	
		this.world = world;
		
		this.player = (EntityPlayer) placer;	
		
		this.pos = pos;
	}

	// Updates the tile entity.
	@Override
	public void update() 
	{	
		// The time of the world.
		this.worldTime = this.updateWorldTime(world);
		
		// This line of code is for debugging.
		// this.player.sendMessage(new TextComponentString("Updating Light. Worldtime: " + this.worldTime));
		
		// Checks whether a block is over the block.
		// If block's exposure to sky is obscured the block will not light up at night.
		// Sorry, you can not use this in caves! :P 
		if (this.checkIfBlockOverhead(world, pos) == true) 
		{
			// Passes in time to set the light based on the time.
			// Disabled until future releases.
			// this.setLightBasedOnTime();
			
			light.setLightLevel(18F);
			light.setLightOpacity(15);
		}
		else if (this.checkIfBlockOverhead(world, pos) == false)
		{
			light.setLightLevel(0F);
			light.setLightOpacity(0);
		}
	}
}

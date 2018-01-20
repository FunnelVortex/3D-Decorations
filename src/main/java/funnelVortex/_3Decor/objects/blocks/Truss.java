package funnelVortex._3Decor.objects.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class Truss extends BlockBase {

	public Truss() {
		super("block_truss", Material.ANVIL);
		this.setHardness(1);
		this.blockSoundType = SoundType.ANVIL;
	}
	
	@Override
    public boolean isLadder(IBlockState state, IBlockAccess world, BlockPos pos, EntityLivingBase entity) 
	{ 
		return true; 
	}
}

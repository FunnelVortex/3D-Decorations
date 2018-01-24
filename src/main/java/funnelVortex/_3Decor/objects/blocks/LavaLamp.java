package funnelVortex._3Decor.objects.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class LavaLamp extends BlockBase {

	public LavaLamp() {
		super("block_lavalamp", Material.GLASS);
		// TODO Auto-generated constructor stub
		this.setLightLevel(16F);
		this.setLightOpacity(15);
		this.setHardness(0);
		this.translucent = true;
	}
}

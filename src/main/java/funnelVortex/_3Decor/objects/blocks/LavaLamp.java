package funnelVortex._3Decor.objects.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;

public class LavaLamp extends BlockBase {

	public LavaLamp() {
		super("block_lavalamp", Material.GLASS);
		// TODO Auto-generated constructor stub
		this.setLightLevel(4F);
		//this.setLightOpacity(10);
		this.setHardness(0);
		this.translucent = true;
	}
	
	@Override
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.TRANSLUCENT;
    }
}

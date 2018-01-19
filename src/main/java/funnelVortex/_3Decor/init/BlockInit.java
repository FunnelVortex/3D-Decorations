package funnelVortex._3Decor.init;

import java.util.ArrayList;
import java.util.List;

import funnelVortex._3Decor.objects.blocks.BlockBase;
import funnelVortex._3Decor.objects.blocks.LargePot;
import funnelVortex._3Decor.objects.blocks.LightningRod;
import funnelVortex._3Decor.objects.blocks.SolarLight;
import funnelVortex._3Decor.objects.blocks.TvAntenna;
import funnelVortex._3Decor.objects.blocks.WoodBoards;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

// Blocks get initialized in this class.
public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>(); 
	
	public static final Block BLOCK_SOLARLIGHT = new SolarLight();
	
	public static final Block BLOCK_TVANTENNA = new TvAntenna();
	
	public static final Block BLOCK_LIGHTNINGROD = new LightningRod();
	
	public static final Block BLOCK_LARGEPOT = new LargePot();
	
	public static final Block BLOCK_WOODBOARDS = new WoodBoards();
}

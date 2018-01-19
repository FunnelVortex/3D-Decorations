package funnelVortex._3Decor;

import funnelVortex._3Decor.objects.blocks.SolarLight;
import funnelVortex._3Decor.objects.blocks.counter.BlockCounter;
import funnelVortex._3Decor.proxy.CommonProxy;
import funnelVortex._3Decor.util.handlers.RecipeHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.main.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.world.World;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = _3Decor.MODID, name=_3Decor.NAME, version = _3Decor.VERSION)

public class _3Decor
{
	// The mod information that will be used when the mod loads.
    public static final String MODID = "decor";
    public static final String VERSION = "1.0";
    public static final String CLIENT = "funnelVortex._3Decor.proxy.ClientProxy";
    public static final String COMMON = "funnelVortex._3Decor.proxy.CommonProxy";
    public static final String NAME = "3Decor Mod";
    public World loadedWorld; 
    
    // public static SolarLight light = new SolarLight();
    // public static BlockCounter counter = new BlockCounter();
    
    // On new instance of mod.
	@Instance
	public static _3Decor instance;
    
	// Creates the proxy.
	@SidedProxy(clientSide = CLIENT, serverSide = COMMON)
	public static CommonProxy proxy;
	
	// Events handled before mod is initialized.
    @EventHandler
    public static void preInit(FMLPreInitializationEvent event)
    {
    	// GameRegistry.registerTileEntity(light.getTileEntityClass(), light.getRegistryName().toString());
    	//GameRegistry.registerTileEntity(counter.getTileEntityClass(), counter.getRegistryName().toString());
    }
    
    // Events handled during mod initialization.
    @EventHandler
    public static void init(FMLInitializationEvent event)
    {
    }
    
    // Events handled after mod initialization.
    @EventHandler
    public static void postInit(FMLPostInitializationEvent event)
    {

    }
}

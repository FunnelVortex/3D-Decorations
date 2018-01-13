package funnelVortex._3Decor.objects.items;

import funnelVortex._3Decor._3Decor;
import funnelVortex._3Decor.init.ItemInit;
import funnelVortex._3Decor.proxy.ClientProxy;
import funnelVortex._3Decor.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{

	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		_3Decor.proxy.registerItemRenderer(this, 0, "inventory");
	}		
}

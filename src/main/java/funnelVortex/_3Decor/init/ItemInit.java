package funnelVortex._3Decor.init;

import java.util.ArrayList;
import java.util.List;

import funnelVortex._3Decor.objects.items.ItemBase;
import net.minecraft.item.Item;

// Blocks get initialized in this class.
public class ItemInit
{
	public static final List<Item> ITEMS = new ArrayList<Item>(); 
	
	public static final Item TEST_ITEM = new ItemBase("item_test");
}

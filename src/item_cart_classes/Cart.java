package item_cart_classes;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;


public class Cart  {

	private List<Item> items;
	
	public Cart() {
		items=new ArrayList<Item>();
	}
	
	public void addItem(Item item) {
		
		items.add(item);
	}
	
	public List<Item> getItems() {
		return items;
	}

	

	
}

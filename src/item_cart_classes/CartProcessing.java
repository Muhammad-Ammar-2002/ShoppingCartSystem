package item_cart_classes;

import java.util.Comparator;

public class CartProcessing {
	
	public static void process_cart(Cart cart,float discountPercent) {
		
		System.out.print("\n *********************************Filter Electronics items********************** \n\n");
		   // Filter Electronics items and print them
		cart.getItems().stream()
		.filter(item->"Electronics".equals(item.getCategory()))
		.forEach(System.out::println);
		
		System.out.print("\n *********************************discount to sale items*********************** \n");
		
		// Apply 10% discount to sale items
		
		System.out.print("\nApplying discount to sale items: " +discountPercent +" %\n\n");
		cart.getItems().stream()
		.filter(Item::getOnSale)
		.forEach(item->item.setDiscount(discountPercent));
		
		  // Print items after discount
		cart.getItems().forEach(System.out::println);
		
		System.out.print("\n *********************************************************************** \n");
		
		// Calculate total price of all items
		float totalPrice=(float) cart.getItems().stream()
				.mapToDouble(Item::getPrice)
				.sum();
		System.out.println("\nTotal Price: " + totalPrice+" E");
		
		System.out.print("\n *********************************Sort by Price********************** \n");
		//	Sort by Price
		         cart.getItems().stream()
				.sorted(Comparator.comparing(Item::getPrice))
				.forEach(System.out::println);
		
		         System.out.print("\n ************************Sort by Name************************* \n");
//		     	Sort by Name
		         cart.getItems().stream()
				.sorted(Comparator.comparing(Item::getName))
				.forEach(System.out::println);
		
	}

}

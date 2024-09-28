package main;
import java.util.function.*;


import item_cart_classes.*;
public class Main {

	public static void main(String[] args) {
		
		Cart cart=new Cart();
		
		  // Adding items to the cart
        cart.addItem(new Item("Laptop", "Electronics", 1000, false));
        cart.addItem(new Item("Smartphone", "Electronics", 600, true));
        cart.addItem(new Item("Shirt", "Clothing", 50, true));
        cart.addItem(new Item("Headphones", "Electronics", 100, true));
        cart.addItem(new Item("Jeans", "Clothing", 80, false));
		
//        Supplier<Cart> supplier=Cart::new;
        
        
        //Process cart using method references and streams
		CartProcessing.process_cart(cart, 10);
	}

}

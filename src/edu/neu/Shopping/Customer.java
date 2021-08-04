package edu.neu.Shopping;

import edu.neu.API.InventoryCartAPI;
import edu.neu.API.Items_List;
import edu.neu.Cart.AddItems;
import edu.neu.Prototype.ParameterizedDecorator;

public class Customer {
	
	InventoryCartAPI cart;
	
	public void CustomerCart() {
		cart = new AddItems();
		
		cart = new ParameterizedDecorator(cart, Items_List.Shirt);
		cart = new ParameterizedDecorator(cart, Items_List.Tooth_Paste);
		
		System.out.println(cart.getDesc());
	}
	
	public static void Demo() {
		Customer c = new Customer();
		c.CustomerCart();
	}
	
}

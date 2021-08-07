package edu.neu.Cart;

import edu.neu.API.InventoryCartAPI;
import edu.neu.API.ItemAPI;

public class AddItems extends ItemAPI implements InventoryCartAPI{

	private String name;
	private double price;
	
	public AddItems() {
		
		this.name = "";
		this.price = 0;
	}

	@Override
	public String getDesc() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.name);
		
		return sb.toString();
	}

	@Override
	public double getCost() {
		return this.price;
	}

}

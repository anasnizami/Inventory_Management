package edu.neu.Cart;

import edu.neu.API.InventoryCartAPI;
import edu.neu.API.ItemAPI;

public class AddItems extends ItemAPI implements InventoryCartAPI{

	private String name;
	private String description;
	private String id;
	private double price;
	
	public AddItems() {
		
		this.name = "Customer Cart";
		this.description = null;
		this.id = "OO";
		this.price = 0;
	}

	@Override
	public String getDesc() {
		StringBuilder sb = new StringBuilder();
		sb.append("Name : ").append(this.name);
		sb.append(",Description : ").append(this.description);
		sb.append(",Code : ").append(this.id);
		sb.append(",Cost = ").append(this.price);
		
		return sb.toString();
	}

	@Override
	public double getCost() {
		return this.price;
	}

}

package edu.neu.Decorator;

import edu.neu.API.InventoryCartAPI;

public class InventoryCartDecorator implements InventoryCartAPI{
	
	InventoryCartAPI cart;
		
	public InventoryCartDecorator(InventoryCartAPI cart) {
		this.cart = cart;
	}

	@Override
	public String getDesc() {
		return this.cart.getDesc();
	}

	@Override
	public double getCost() {
		return this.cart.getCost();
	}

}

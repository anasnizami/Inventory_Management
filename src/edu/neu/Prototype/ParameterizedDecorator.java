package edu.neu.Prototype;

import java.util.HashMap;
import java.util.Map;

import edu.neu.API.*;
import edu.neu.Decorator.InventoryCartDecorator;
import edu.neu.FactoryItem.*;

public class ParameterizedDecorator extends InventoryCartDecorator{

	private static Map<Items_List, ItemAPI> list = new HashMap<Items_List, ItemAPI>();
	
	private String description;
	private String name;
	private double price;
	
	public ParameterizedDecorator(InventoryCartAPI cart,Items_List items) {
		super(cart);
		getValues(items);
	}
	
	static {
		list.put(Items_List.Tooth_Paste, new ToothPasteFactory().getObject());
		list.put(Items_List.Shirt, new ShirtFactory().getObject());
	}
	
	public ItemAPI getItemObject(Items_List s) {
		return (ItemAPI) list.get(s).clone();
	}
	
	private void getValues(Items_List items) {
		ItemAPI item = getItemObject(items);
		this.description = item.getDescription();
		this.name = item.getName();
		this.price = item.getPrice();
	}
	
	public String getDesc() {
		StringBuilder sb = new StringBuilder();
		sb.append("Name : ").append(this.name);
		sb.append(",Description : ").append(this.description);
		sb.append(",Cost = ").append(this.price);
		
		return super.getDesc()+ ", ,"+ sb.toString();

	}

	public double getCost() {
		return super.getCost()+this.price;
	}
}
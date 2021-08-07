package edu.neu.FactoryItem;

import edu.neu.API.AbstractFactoryAPI;
import edu.neu.API.ItemAPI;
import edu.neu.Item.ToothPaste;

public class ShirtFactory  extends AbstractFactoryAPI{
	
	private static ItemAPI instance = null;
	
	@Override
	public ItemAPI getObject() {
		if(instance == null) {
			instance = new ToothPaste("Shirt", "Clothing", 20);
		}
		return instance;
	}
}

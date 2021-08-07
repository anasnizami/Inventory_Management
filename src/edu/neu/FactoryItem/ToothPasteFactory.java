package edu.neu.FactoryItem;

import edu.neu.API.AbstractFactoryAPI;
import edu.neu.API.ItemAPI;
import edu.neu.Item.ToothPaste;

public class ToothPasteFactory extends AbstractFactoryAPI{
	
	private static ItemAPI instance = null;
	
	@Override
	public ItemAPI getObject() {
		if(instance == null) {
			instance = new ToothPaste("Tooth Paste", "Hygiene", 5);
		}
		return instance;
	}
}

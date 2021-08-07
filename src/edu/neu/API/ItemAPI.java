package edu.neu.API;

public class ItemAPI implements Cloneable{

	    private int price;
	    private String name;
	    private String description;

	    public ItemAPI() {
	        super();
	    }
	    
	    public ItemAPI(String name, String des, int price) {
	    	this.name = name;
	    	this.description = des;
	    	this.price = price;
	    }
	    
		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	    
	    public Object clone() {
			Object clone = null;
			
			try {
				clone  = super.clone();
			} catch (CloneNotSupportedException cloneException) {
				cloneException.printStackTrace();
			}
			
			return clone;
			
		}
}

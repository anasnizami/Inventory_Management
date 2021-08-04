package edu.neu.API;

public class ItemAPI implements Cloneable{

	 	private int id;
	    private double price;
	    private String name;
	    private String description;

	    public ItemAPI() {
	        super();
	    }
	    
	    public ItemAPI(int id, String name, String des, double price) {
	    	this.id = id;
	    	this.name = name;
	    	this.description = des;
	    	this.price = price;
	    }
	    
	    public int getId() {
			return this.id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
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

		/**
	     * return a String representation of the object state
	     */
	    @Override
	    public String toString() {
	        StringBuilder sb = new StringBuilder();
	        
	        sb.append("# ").append(id);
	        sb.append(" $ ").append(price);
	        sb.append(" ").append(name);
	        sb.append(" '").append(description).append("'");
	        
	        return sb.toString();
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

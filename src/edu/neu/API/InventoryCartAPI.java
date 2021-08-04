package edu.neu.API;

public interface InventoryCartAPI {

	/**
     * get a String description of the billing statement to patient
     * 
     * @return    String description of the specific expenses billed in statement
     */
    String getDesc();
    /**
     * get the cost as billed to the patient for hospital expenses
     * 
     * @return    cost as billed in statement
     */
    double getCost();
	
}

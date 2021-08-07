package edu.neu.Facade_Read_Write;
import java.util.List;

public abstract class Document {
	
	public static final String customer_path = "src/customer_order.csv";
	public static final String employee_path = "src/employee_details.csv";
	public static final String inventory_path = "src/inventory.csv";
	
	/**
	 * Write all the data
	 * @param programData : List containing all the data needed to be written
	 */
	public abstract void save(List<String> programData);	
	
	public abstract void update(List<String> newData);

	/**
	 * Read the file and copy all the data to a list 
	 * @return : List with all the data from the file
	 */
	public abstract List<String> load();
}

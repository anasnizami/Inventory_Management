package edu.neu.State;

public class Roles {

	private static State state_instance = new State();
	private static AdminState admin = new AdminState();
	private static CustomerState customer= new CustomerState();

	public static void Role_implementation(int choice) {
		
		if(choice == 1) {
			
			customer.action(state_instance);
		
		}else if(choice == 2) {

			admin.action(state_instance);
		
		}else{
			System.out.println("EXITING....");
		}	
	}	
}

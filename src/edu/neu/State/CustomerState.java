package edu.neu.State;

import edu.neu.API.StateAPI;
import edu.neu.Shopping.Customer;

public class CustomerState extends StateAPI{

	Customer c = new Customer();
	@Override
	public void action(State state) {
		state.setState(this);
		c.Demo();
	}

	@Override
	public void action(State state, String name) {
		// TODO Auto-generated method stub
		
	}

}

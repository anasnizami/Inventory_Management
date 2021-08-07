package edu.neu.State;

import edu.neu.API.StateAPI;

public class AdminState extends StateAPI{

	@Override
	public void action(State state) {

	}

	@Override
	public void action(State state, String name) {
		// TODO Auto-generated method stub
		state.setState(this);
		if(name == StateAPI.admin_role1) {
			
		}else {
			
		}
		
	}


}

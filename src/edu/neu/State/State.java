package edu.neu.State;

import edu.neu.API.StateAPI;

public class State {

	private StateAPI state;

	public State() {
		state = null;
	}	
	
	public StateAPI getState() {
		return state;
	}

	public void setState(StateAPI state) {
		this.state = state;
	}

	
}

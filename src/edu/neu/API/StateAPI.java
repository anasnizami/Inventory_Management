package edu.neu.API;

import edu.neu.State.State;

public abstract class StateAPI {
	
	public static String admin_role1 = "Manager";
	public static String admin_role2 = "Employee";
	/**
	 * Performs the action of saving oe loading info
	 * @param state
	 */
	public abstract void action(State state);
	
	public abstract void action(State state, String name);
}

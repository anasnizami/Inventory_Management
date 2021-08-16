package edu.neu.State;

import java.util.Scanner;

import edu.neu.API.StateAPI;
import edu.neu.Strategy.AddEmployeeStrategy;
import edu.neu.Strategy.RateEmployeeStrategy;
import edu.neu.Strategy.StrategyTrigger;

public class AdminState extends StateAPI{

	@Override
	public void action(State state) {
		Scanner ch = new Scanner(System.in);
		int choice;
		StrategyTrigger tri;
		state.setState(this);
		
		System.out.print("1. Add Employee\n2. Rate Employee\nChoice: ");
			choice = ch.nextInt();
		
		if(choice == 1) {
			tri = new StrategyTrigger(new AddEmployeeStrategy());
			tri.executeStrategy();
		}else if(choice == 2) {
			tri = new StrategyTrigger(new RateEmployeeStrategy());
			tri.executeStrategy();
		}else
			System.err.println("Wrong choice");
		
		ch.close();
		
	}

	@Override
	public void action(State state, String name) {
		
		
		
	}


}

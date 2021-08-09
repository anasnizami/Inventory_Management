package edu.neu.State;

import java.util.Scanner;

import edu.neu.API.StateAPI;
import edu.neu.Employee.AddEmployee;

public class AdminState extends StateAPI{

	@Override
	public void action(State state) {
		Scanner ch = new Scanner(System.in);
		int choice;
		state.setState(this);
		
		System.out.print("1. Add Employee\n2. Rate Employee\nChoice: ");
			choice = ch.nextInt();
		
		if(choice == 1) {
			AddEmployee.add();
		}else if(choice == 2) {
			AddEmployee.RateEmployee();
		}else
			System.err.println("Wrong choice");
		
		ch.close();
	}

	@Override
	public void action(State state, String name) {
		
		
		
	}


}

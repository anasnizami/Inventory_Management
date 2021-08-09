package edu.neu.Employee;

import java.util.Scanner;

import edu.neu.API.People;
import edu.neu.Facade_Read_Write.Facade;

public class AddEmployee extends People{

	int rating;
	static Facade f = new Facade();
	
	public AddEmployee(String name, String position, int id, String dob) {
		super(name, position, id, dob);
	}
	
	
	public static void add() {
		Scanner Fname = new Scanner(System.in), 
				Position = new Scanner(System.in), 
				DOB = new Scanner(System.in), 
				Id = new Scanner(System.in);
				
		/*
		String name, position, dob;
		int id;
		System.out.print("\nEnter Name: ");
			name = Fname.nextLine();
		System.out.print("\nEnter Position : ");
			position = Position.nextLine();
		System.out.print("\nEnter Date Of Birth : ");
			dob = DOB.nextLine();
		System.out.print("\nEnter ID: ");
			id = Id.nextInt();
			*/
		//People p = new AddEmployee(name, position, id, dob);
		People p = new AddEmployee("Anas","POs",3,"1341234");
		f.write(p);
		
		Fname.close();
		Position.close();
		DOB.close();
		Id.close();
	}
	
	public static void RateEmployee() {
		Scanner Rating = new Scanner(System.in),
				Id = new Scanner(System.in);
		
		int rating, id;
		
		System.out.print("\nEnter ID: ");
		id = Id.nextInt();
		
		System.out.print("\nEnter Rating : ");
		rating = Rating.nextInt();
		
		f.edit_file(id, rating);
		
		Rating.close();
		Id.close();
	}
}
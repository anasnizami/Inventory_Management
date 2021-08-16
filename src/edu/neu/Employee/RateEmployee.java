package edu.neu.Employee;

import java.util.Scanner;

import edu.neu.Command_UDP.Communication;
import edu.neu.Facade_Read_Write.Facade;

public class RateEmployee {

	Facade f = new Facade();
	
	public void rating() {
		Scanner Rating = new Scanner(System.in),
				Id = new Scanner(System.in);
		
		int rating, id;
		
		System.out.print("\nEnter ID: ");
		id = Id.nextInt();
		
		System.out.print("\nEnter Rating : ");
		rating = Rating.nextInt();
		
		f.edit_file(id, rating);
		Communication.sendMessage("Rating provided for id no : " + id);
		
		Rating.close();
		Id.close();
	}
	
}

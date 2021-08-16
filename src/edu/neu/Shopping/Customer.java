package edu.neu.Shopping;

import java.util.Scanner;

import edu.neu.API.InventoryCartAPI;
import edu.neu.API.Items_List;
import edu.neu.Cart.AddItems;
import edu.neu.Facade_Read_Write.Facade;
import edu.neu.Prototype.ParameterizedDecorator;

public class Customer {
	
	InventoryCartAPI cart = new AddItems();
	String Fname,Lname;
	int id, age;
	Facade f = new Facade();
	
	public Customer() {
		
	}

	public Customer(String fname, String lname, int id, int age) {
		super();
		Fname = fname;
		Lname = lname;
		this.id = id;
		this.age = age;
	}

	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Customer Info, First name : " + Fname + ", Last name : " + Lname + ", Id : " + id + ",Age : " + age ;
	}

	public void CustomerCart(int i, Customer c) {
		
		
		if(i == 1) {
			cart = new ParameterizedDecorator(cart, Items_List.Shirt);
		}else if(i ==2){
			cart = new ParameterizedDecorator(cart, Items_List.Tooth_Paste);
		}else if(i ==3){
			//System.out.println(cart.getDesc() + "--->" + cart.getCost());
			f.write(cart,c);
		}
	}
	
	public void Demo() {

		Scanner input = new Scanner(System.in);
		Scanner Fname = new Scanner(System.in), 
				Lname = new Scanner(System.in), 
				Age = new Scanner(System.in), 
				Id = new Scanner(System.in);
		String fname, lname = null;
		int id, age, i = 1;		
		Facade f = new Facade();
		
		System.out.print("\nEnter First Name: ");
			fname = Fname.nextLine();
		System.out.print("\nEnter Last Name: ");
			lname = Lname.nextLine();
		System.out.print("\nEnter Age: ");
			age = Age.nextInt();
		System.out.print("\nEnter ID: ");
			id = Id.nextInt();
		Customer c = new Customer(fname, lname, id, age);
		
		while(i == 1)
		{

			System.out.print("===============================\n"
					+ "HELLO. PLEASE CHOOSE A OPTION\n1. Add Item  2. Search  3. Exit\n");
			System.out.print("Choice : ");

			int choice = input.nextInt();
			
			//Adding items
			if(choice == 1) 
			{
				
				System.out.print("\nEnter 1 for SHirt, 2 for Tooth Paste and 3 for done ");
				int option = input.nextInt();
				
				c.CustomerCart(option, c);
				
			}
			//Selling Items
			else if(choice == 2) 
			{	
				System.out.print("\nEnter Last Name: ");
				lname = Lname.nextLine();
				f.read(lname,1);
			}else 
			{
				i = 2;
				System.out.print("\nEnter Last Name: ");
				lname = Lname.nextLine();
				f.edit_file("Delivered", lname);
				f.read(lname,1);
				System.out.println("EXITING.....");
			}

		}
		
			//System.out.print(c.toString());
			Fname.close();
			Lname.close();
			Age.close();
			Id.close();
			input.close();
	
		}
	
	}

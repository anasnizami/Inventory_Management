package edu.neu.Facade_Read_Write;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import edu.neu.API.InventoryCartAPI;
import edu.neu.API.People;
import edu.neu.Shopping.Customer;


public class Facade {

	List<String> wrt = new ArrayList<String>();
	List<String> wrtEmp = new ArrayList<String>();
	List<String> rd = new ArrayList<String>();
	List<String> edt = new ArrayList<String>();
	StringBuilder a = new StringBuilder();

	private Document write, writeEmp;
	private Document read, readEmp;

	public Facade() {
		write = new WriteData(Document.customer_path);
		writeEmp = new WriteData(Document.employee_path); 
		read = new ReadData(Document.customer_path);
		readEmp = new ReadData(Document.employee_path);
	}

	public void write(InventoryCartAPI inventory, Customer c) {	

		a.append("Status : Placed,").append(c.toString());
		a.append(inventory.getDesc()).append(", Total Bill : "+inventory.getCost()+"\n");

		wrt.add(a.toString());
		write.save(wrt);
	}

	public void write(People p) {
		a.append("Name : "+p.getName()).append(", DOB : "+p.getDob());
		a.append(", ID : "+p.getId()).append(", Position : "+p.getPosition());
		a.append(", Rating : "+ 0);

		wrtEmp.add(a.toString());
		writeEmp.save(wrtEmp);
	}

	public void read(String str, int ch) {
		if(ch == 1) {
			rd = read.load();
		}
		else {
			rd = readEmp.load();
		}

		String s;
		Iterator<String> itr = rd.iterator();
		while (itr.hasNext()) {
			s = itr.next();
			if(s.contains(str)) {
				System.out.println("Record Found");
				System.out.println(s);
				return;
			}
		}
		System.out.println("Not found");

	}

	public void edit_file(String status, String name) {
		rd = read.load();
		String str;
		String[] splt;
		Iterator<String> itr = rd.iterator();

		while (itr.hasNext()) {    

			str = itr.next();

			if(str.contains(name)) {
				splt = str.split(",");
				splt[0] = "Status : "+status;
				a.append(splt[0]);

				for(int i = 1;i<splt.length;i++) {
					a.append(", "+splt[i]);
				}

				edt.add(a.toString()+"\n");
				System.out.println("Status changed");
			}else
			{
				edt.add(str);
			}

		}
		write.update(edt);
	}


	public void edit_file(int id, int rating) {
		rd = readEmp.load();
		String str;
		String[] splt;
		Iterator<String> itr = rd.iterator();

		while (itr.hasNext()) {    

			str = itr.next();
			splt = str.split(",");
			
			for(int i = 0;i<splt.length;i++) {
				System.out.print(splt[i]+"\n");
			}
			
			if(splt[2].contains(Integer.toString(id))) {
				
				System.out.println("Found "+ splt[2]);
				splt[splt.length-1] = "Rating : "+ rating;
				a.append(splt[0]);

				for(int i = 1;i<splt.length;i++) {
					a.append(", "+splt[i]);
				}

				edt.add(a.toString());
				System.out.println("Status changed");
			}else
			{
				edt.add(str);
			}

		}
		writeEmp.update(edt);
	}
}
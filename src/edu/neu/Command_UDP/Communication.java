package edu.neu.Command_UDP;

import java.util.ArrayList;
import java.util.List;

import edu.neu.API.CommandAPI;

public class Communication {
	

 private List<CommandAPI> orderList = new ArrayList<CommandAPI>(); 
	 
	 public void takeOperation(CommandAPI op) {
		 orderList.add(op);
	 }
	 
	 public void executeOperation() {
		 for(CommandAPI op :orderList) {
			 op.execute();
		 }
		 
		 orderList.clear();
	 }
	 
	 public static void sendMessage(String msg) {
		 Server s = new Server();
		 Client c = new Client(msg);
		 
		 Communication com = new Communication();
		 com.takeOperation(s);
		 com.takeOperation(c);
		 
		 com.executeOperation();
		 
		 
	 }
}

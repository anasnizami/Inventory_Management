package edu.neu.Strategy;

import edu.neu.API.StrategyAPI;
import edu.neu.Employee.RateEmployee;

public class RateEmployeeStrategy implements StrategyAPI{

	RateEmployee rate = new RateEmployee(); 
	
	@Override
	public void operation() {
		
		rate.rating();
	
	}

}

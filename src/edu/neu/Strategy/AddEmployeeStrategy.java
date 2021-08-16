package edu.neu.Strategy;

import edu.neu.API.StrategyAPI;
import edu.neu.Employee.AddEmployee;

public class AddEmployeeStrategy implements StrategyAPI{

	@Override
	public void operation() {
		
		AddEmployee.add();
		/*
		 * if(employeeRepository.usernameExists(employee.getUsername()))
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Username already exists");
		employeeRepository.saveEmployee(employee);
		 */
	}

}

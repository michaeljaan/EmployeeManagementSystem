package in.com.cg.controller;

import java.util.HashMap;
import java.util.Map;

import in.com.cg.bean.Employee;
import in.com.cg.service.EmployeeService;

public class EmployeeController {
	public EmployeeService employeeService;

	// obtains employee details
	public void setService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	// adds employee details into database
	public void addEmployee(Map<String, String> employee) {
		employeeService.addEmployee(employee);
	}

	// used to view the data entered in the database
	public HashMap<Integer, Employee> viewAllEmployee() {
		return employeeService.viewAllEmployee();
	}

	// get employeeid
	public Employee getEmployeeById(int id) {
		return employeeService.getEmployeeById(id);
	}

	// delete employee id from database
	public void deleteEmployee(int id) {
		employeeService.deleteEmployee(id);
	}
}

package in.com.cg.service;

import java.util.HashMap;
import java.util.Map;

import in.com.cg.bean.Employee;
import in.com.cg.dao.EmployeeDAO;

public class EmployeeService {

	public EmployeeDAO dao;

	// obtains employee details
	public void setDao(EmployeeDAO dao) {
		this.dao = dao;
	}

	// adds employee details into database
	public void addEmployee(Map<String, String> employee) {
		dao.addEmployee(employee);
	}

	// used to view the data entered in the database
	public HashMap<Integer, Employee> viewAllEmployee() {
		return dao.viewAllEmployee();
	}

	// get employeeid
	public Employee getEmployeeById(int id) {
		return dao.getEmployeeById(id);
	}

	// delete employee id from database
	public void deleteEmployee(int id) {
		dao.deleteEmployee(id);
	}
	
}

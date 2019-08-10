package structural_patterns.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
	
	public List<Employee> getEmployeeList() {
		List<Employee> employees = new ArrayList<>();
		Employee employee = new EmployeeDB("1", "Roj", "Carranz", "test@test.com");
		employees.add(employee);
		// This will connect to Employee using Adapter
		EmployeeLdap employeeFromLdap = new EmployeeLdap("chewie", "Cam", "Jose", "test2@test.com");
		employees.add(new EmployeeAdapterLdap(employeeFromLdap));
		
		
		return employees;
	}

}

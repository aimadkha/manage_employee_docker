package net.manage_employee.registration.repository;

import net.manage_employee.registration.model.Employee;

public interface IEmployeeRepository {
	public Employee getEmployeeByName(String name);
	public Employee getEmployeeByEmail(String email);
	public boolean checkAdmin(String email, String pass);
	

}

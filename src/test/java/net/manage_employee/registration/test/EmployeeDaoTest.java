/*package net.manage_employee.registration.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import net.manage_employee.registration.dao.EmployeeDao;
import net.manage_employee.registration.model.Address;
import net.manage_employee.registration.model.Employee;

public class EmployeeDaoTest {

	@Test
	public void testSaveEmployee() {
		EmployeeDao empDao = new EmployeeDao();
		Address adress = new Address("youcode", "youssoufia", "maroc");
		Employee emp = new Employee("aimad", "aimad", "aimad@gmail.com", "aimadaimad", "876876");
		emp.setAddress(adress);
		Assert.assertNotNull(empDao.saveEmployee(emp));
	}

	@Test
	public void testUpdateEmployee() {
		EmployeeDao empDao = new EmployeeDao();
		Employee emp1 = empDao.getEmployeeById((long) 3);
		emp1.setFirstName("ahmedahmed");
		empDao.updateEmployee(emp1);
		assertEquals("ahmedahmed", emp1.getFirstName());
	}

	@Test
	public void testGetEmployeeById() {
		EmployeeDao empDao = new EmployeeDao();
		Employee emp = new Employee();
		emp = empDao.getEmployeeById((long) 1);
		assertEquals("aimad", emp.getFirstName());
	}

	@SuppressWarnings("deprecation")
	@Test
	public final void testDelete() {
		EmployeeDao empDao = new EmployeeDao();
		empDao.deleteEmployee((long) 7);
		Assert.assertNull(empDao.getEmployeeById((long) 7));
	}

	@Test
	public final void testFindAll() {
		EmployeeDao empDao = new EmployeeDao();
		List<Employee> emps = empDao.getEmployees();
		//assertThat(emps.size(), is)
		assertEquals(9, empDao.getEmployees().size());
	}


}

*/

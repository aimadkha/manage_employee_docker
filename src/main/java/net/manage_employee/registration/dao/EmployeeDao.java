package net.manage_employee.registration.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.Transaction;

import net.manage_employee.registration.DBUtil.HibernateUtile;
import net.manage_employee.registration.DBUtil.JpaUtile;
import net.manage_employee.registration.model.Employee;

public class EmployeeDao {
	private static EntityManager em;
	// save Employee
	// get All employee
	// get employee By Id
	// Update employee
	// Delete employee

	public Employee saveEmployee(Employee employee) {

		this.em = JpaUtile.connect().createEntityManager();
		try {
			// start the transaction
			em.getTransaction().begin();
			
			// save employee
			em.persist(employee);
			
			// commit the transaction
			em.getTransaction().commit();
		} catch (Exception e) {
			if (em.getTransaction() != null) {
				em.getTransaction().rollback();
			}
		}
		return employee;

	}

	public void updateEmployee(Employee employee) {
		this.em = JpaUtile.connect().createEntityManager();
		try {
			// start the transaction
			em.getTransaction().begin();
			
			// save employee
			em.merge(employee);

			// commit the transaction
			em.getTransaction().commit();
		} catch (Exception e) {
			if (em.getTransaction() != null) {
				em.getTransaction().rollback();
			}
		}
	}

	public Employee getEmployeeById(Long id) {
		this.em = JpaUtile.connect().createEntityManager();
		Employee employee = null;
		try {
			// start the transaction
			em.getTransaction().begin();
			
			// save employee
			employee = em.find(Employee.class, id); 

			// commit the transaction
			em.getTransaction().commit();
		} catch (Exception e) {
			if (em.getTransaction() != null) {
				em.getTransaction().rollback();
			}
		}
		return employee;
	}

	@SuppressWarnings("unchecked")
	public List<Employee> getEmployees() {
		this.em = JpaUtile.connect().createEntityManager();
		List<Employee> employees = null;
		// Employee employee = null;
		try {
			// start the transaction
			em.getTransaction().begin();
			
			employees = em.createQuery("from Employee").getResultList();

			// commit the transaction
			em.getTransaction().commit();
		} catch (Exception e) {
			if (em.getTransaction() != null) {
				em.getTransaction().rollback();
			}
		}
		return employees;
	}

	public Employee deleteEmployee(Long id) {
		this.em = JpaUtile.connect().createEntityManager();
		Employee employee = null;
		try {
			// start the transaction
			em.getTransaction().begin();
			
			// save employee
			employee = em.find(Employee.class, id); 
			em.remove(employee);

			// commit the transaction
			em.getTransaction().commit();
		} catch (Exception e) {
			if (em.getTransaction() != null) {
				em.getTransaction().rollback();
			}
		}
		return employee;
	}

}

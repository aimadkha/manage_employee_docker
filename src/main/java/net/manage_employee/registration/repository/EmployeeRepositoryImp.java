package net.manage_employee.registration.repository;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import net.manage_employee.registration.DBUtil.HibernateUtile;
import net.manage_employee.registration.model.Employee;

public class EmployeeRepositoryImp implements IEmployeeRepository {

	@Override
	public Employee getEmployeeByName(String name) {
		Employee employee = null;
		Transaction transaction = null;
		try(Session session = HibernateUtile.getSessionFactory().openSession()){
			transaction = session.beginTransaction();
			
			Query query = session.createQuery("from Employee where name =:name");
			query.setParameter("name", name);
			employee = (Employee) query.uniqueResult();
			
			transaction.commit();
			
		}catch(Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
		}
		// TODO Auto-generated method stub
		return employee;
	}

	@Override
	public Employee getEmployeeByEmail(String email) {
		Employee employee = null;
		Transaction transaction = null;
		try(Session session = HibernateUtile.getSessionFactory().openSession()){
			transaction = session.beginTransaction();
			
			Query query = session.createQuery("from Employee where email =:email");
			query.setParameter("email", email);
			employee = (Employee) query.uniqueResult();
			
			transaction.commit();
			
		}catch(Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
		}
		// TODO Auto-generated method stub
		return employee;
	}

	@Override
	public boolean checkAdmin(String email, String pass) {
		Employee employee = null;
		Transaction transaction = null;
		try(Session session = HibernateUtile.getSessionFactory().openSession()){
			transaction = session.beginTransaction();
			
			Query query = session.createQuery("from Employee where email =:email and password=:pass and emp_role=:role");
			query.setParameter("email", email);
			query.setParameter("pass", pass);
			query.setParameter("role", "admin");
			if (query.uniqueResult()!=null) {
				return true;
			}
			
			transaction.commit();
			
		}catch(Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
		}
		
		return false;
	}
	

}

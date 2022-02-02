package net.manage_employee.registration.DBUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtile {
	private static EntityManagerFactory emf;
	private static EntityManager em;
	
	public static EntityManagerFactory connect() {
		
		emf = Persistence.createEntityManagerFactory("emp");
		em = emf.createEntityManager();
		
		return emf;
	}

}

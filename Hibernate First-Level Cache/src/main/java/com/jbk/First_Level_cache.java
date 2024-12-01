package com.jbk;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class First_Level_cache {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateConfig.getSessionFactory();

		/*
		 * Level One Caching : 1] Associated with session
		 * 
		 * 2] Hibernate provide Level one cache by default
		 * 
		 */
		Session session = sessionFactory.openSession();

		Employee employee1 = session.get(Employee.class, 101);
		System.out.println(employee1);

		Employee employee2 = session.get(Employee.class, 101);
		System.out.println(employee2);
	}

}

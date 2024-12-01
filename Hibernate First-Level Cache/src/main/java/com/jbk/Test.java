package com.jbk;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
		Session session = sessionFactory.openSession();

		Address address = new Address(1, "pune", "MH", "Pune", 414603);
		Employee employee = new Employee(102, "bb", "HR", 123456, address);

		session.save(employee);
		session.beginTransaction().commit();
		System.out.println("Done");

	}

}

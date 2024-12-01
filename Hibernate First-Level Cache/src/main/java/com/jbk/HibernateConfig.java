package com.jbk;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfig {
	public static SessionFactory getSessionFactory() {
		Configuration cfg = new Configuration();
		cfg.configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Address.class);

		SessionFactory sessionFactory = cfg.buildSessionFactory();

		return sessionFactory;
	}
}

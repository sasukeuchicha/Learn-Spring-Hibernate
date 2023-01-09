package com.hibernate.hibernateLearn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {
		
		//Configuration class and use the .configure method to initiate configuration 
		Configuration config = new Configuration().configure("hibernate.cfg.xml");
		//Build session factory from the configured object
		SessionFactory sessionFactory = config.buildSessionFactory();
		//get a open session from the session factory
		Session session = sessionFactory.openSession();
		//get method
		Student student =(Student)session.get(Student.class, 1);
		Address getAddress = (Address)session.get(Address.class, 2); //gets null if there is no primary key found
		
		Address loadAddress = (Address)session.load(Address.class, 1); //loads null pointer exception if no primary key found
		
		System.out.println(student);
		System.out.println(getAddress);
		System.out.println(loadAddress);
		
		//close sessions
		session.close();
		//close session factory
		sessionFactory.close();
		
	}
}

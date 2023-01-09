package com.hibernate.hibernateLearn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbeddableDemo {
	public static void main(String[] args) {
		// Configuration class and use the .configure method to initiate configuration
		Configuration config = new Configuration().configure("hibernate.cfg.xml");
		// Build session factory from the configured object
		SessionFactory sessionFactory = config.buildSessionFactory();
		// get a open session from the session factory
		Session session = sessionFactory.openSession();
		
		//creating student 1 data and certificate 1 data
		Student student1 = new Student();
		
		student1.setCity("Lucknow");
		student1.setId(2);
		student1.setName("Suresh");
		
		Certificate certi1 = new Certificate();
		
		certi1.setCourse("Java Spring");
		certi1.setDuration("3 months");
		
		student1.setCerti(certi1);
		// creating student 2 data and certificate 2 data
		Student student2 = new Student();
		
		student2.setCity("Delhi");
		student2.setId(3);
		student2.setName("Mukesh");
		
		Certificate certi2 = new Certificate();
		
		certi2.setCourse("Python 3");
		certi2.setDuration("1 month");
		
		student2.setCerti(certi2);
		
		Transaction transaction = session.beginTransaction();
		
		//objects save
		session.save(student1);
		session.save(student2);
		
		
		transaction.commit();
		
		
		session.close();
		sessionFactory.close();
	}
}
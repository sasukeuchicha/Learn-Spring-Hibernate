package com.hibernate.hibernateLearn;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Started project" );
        
        //Create configuration first
        Configuration config = new Configuration();
        
        // provide path for hibernate configuration file path
        config.configure("hibernate.cfg.xml");
        
        //create factory to have collections of live sessions
        SessionFactory factory = config.buildSessionFactory();
        
        //check by printing the factory
        System.out.println(factory);
        
        System.out.println(factory.isClosed());
        
        //create Student 
        
        Student student = new Student();
        student.setId(1);
        student.setName("Ramesh");
        student.setCity("Bangalore");
        System.out.println(student);
        
        // create object of address
        Address address = new Address();
        address.setAddressStreet("224 B Baker Street");
        address.setAddressCity("London");
        address.setOpen(true);
        address.setAddedDate(new Date());
        address.setX(1);
        //Read image
        @SuppressWarnings("resource")
		FileInputStream fis = new FileInputStream("src/main/java/test.png");
        byte[] imageData = new byte[fis.available()]; 
        fis.read(imageData);
        address.setAddressImage(imageData);
        
        //create session from factory or get session from factory session "OpenSession" method gets session thats open
        Session session = factory.openSession();
        //begin transaction to save the object student
        Transaction transaction = session.beginTransaction();
        //ask the session to save the changes
        session.save(student);
        session.save(address);
        //session.getTransaction().commit();
        transaction.commit();
        //close the current opened session
        session.close();
        
        System.out.println("done");
        
        
    }
}

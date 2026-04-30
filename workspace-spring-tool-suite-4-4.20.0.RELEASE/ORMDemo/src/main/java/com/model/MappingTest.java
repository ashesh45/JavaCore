package com.model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MappingTest {
	
	
	public static void main(String[] args) {
		
		// onetoone();
		// onetomany();
		 manytomany();
	}
	
	static void onetoone() {
		
		//create connection
		
	SessionFactory sf  = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session = sf.openSession();
		session.beginTransaction();
		
		
		Address a1 = new Address();
		a1.setCity("London");
		a1.setCountry("England");
	    a1.setState("Bagmati");
		 session.save(a1);
		 
		 
			Employee e1 = new Employee();
			e1.setName("Bikesh");
			e1.setEmail("bikeshmhrzn21@gmail.com");
		    e1.setSalary("3000");
		    e1.setAddress(a1);
			 session.save(e1);
		 
		 
		 

	        session.getTransaction().commit();
	        session.close();
	        sf.close();
	        
	        System.out.println("Address saved successfully!");	
		
	}
	
	
	
	//oneTo Many
	
	static void onetomany() {
		
		//create connection
		
	SessionFactory sf  = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session = sf.openSession();
		session.beginTransaction();
		
		
		Address a1 = new Address();
		a1.setCity("pokhara");
		a1.setCountry("Italy");
	    a1.setState("karnali");
		 session.save(a1);
		 
		 
			Employee e1 = new Employee();
			e1.setName("Aakash");
			e1.setEmail("njs21@gmail.com");
		    e1.setSalary("12400");
		    e1.setAddress(a1);
			 session.save(e1);
		 
		 
		   Phone p1  = new Phone();
		   p1.setNumber("9844849494");
		   p1.setType("Ncell");
		   p1.setEmployee(e1);
		   session.save(p1);
		   
		   
		   
		   Phone p2  = new Phone();
		   p2.setNumber("9844849494");
		   p2.setType("NTC");
		   p2.setEmployee(e1);
		   session.save(p2);
		   
		   e1.setPhones(List.of(p1,p2));
		   

	        session.getTransaction().commit();
	        session.close();
	        sf.close();
	        
	        System.out.println("Address saved successfully!");	
		
	}
	
	
	//manytoamny
	
static void manytomany() {
		
		//create connection
	

	    // create connection
	    SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	    Session session = sf.openSession();
	    session.beginTransaction();

	    // Address
	    Address a1 = new Address();
	    a1.setCity("washington");
	    a1.setCountry("denmark");
	    a1.setState("koshi");
	    session.save(a1);

	    // Employee
	    Employee e1 = new Employee();
	    e1.setName("ajay");
	    e1.setEmail("nj@gmail.com");
	    e1.setSalary("78000");
	    e1.setAddress(a1);
	    session.save(e1);

	  
	    Phone p1 = new Phone();
	    p1.setNumber("9844234");
	    p1.setType("Ncell");
	    p1.setEmployee(e1);

	    Phone p2 = new Phone();
	    p2.setNumber("98423444");
	    p2.setType("NCELL");
	    p2.setEmployee(e1);

	    session.save(p1);
	    session.save(p2);

	
	    Department d1 = new Department();
	    d1.setName("IT");
	    session.save(d1);
	    
	    Department d2 = new Department();
	    d2.setName("HR");
	    session.save(d2);

	  
	    e1.setDepartments(List.of(d1, d2));
	    e1.setPhones(List.of(p1, p2));
	  
	    session.save(e1);
	    session.getTransaction().commit();
	    session.close();
	    sf.close();

	    System.out.println("Data saved successfully!");
	}
	

}

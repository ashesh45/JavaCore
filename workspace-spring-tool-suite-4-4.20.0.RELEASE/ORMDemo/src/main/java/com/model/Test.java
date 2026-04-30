package com.model;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class Test {
	
	public static void main(String[] args)
	{
			
		//add();
		// getall();
	   //update();
         delete();
		
	}
	
	// add customer
	
	static void add() {
		
		SessionFactory sf  = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session = sf.openSession();
		session.beginTransaction();
		
			Customer c1 = new Customer();
			c1.setName("bijay");
			c1.setAge("44");
			c1.setCity("lalitpur");
			c1.setPhone("98908023");
			
			session.save(c1);     // write insert sql 
			session.getTransaction().commit();   // execute sql
			session.close();    // close connection
		
		
		
	}
	
	static void getall() {
		
        SessionFactory sf  = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session = sf.openSession();
		session.beginTransaction();
		
		Criteria crt = session.createCriteria(Customer.class);
		//crt.add(Restrictions.gt("age", 30));
		//crt.add(Restrictions.in("city","kathmandu",pokhara));
			
		   List<Customer> clist = crt.list();
			System.out.println(clist);
		
		
	}
	
	
	static void update() {
		
		
		   SessionFactory sf  = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			
			Session session = sf.openSession();
			session.beginTransaction();
			
			Customer ct = (Customer) session.get(Customer.class, 8);
			
			ct.setCity("butwal");
			ct.setAge("2");
			
			session.update(ct);    
			session.getTransaction().commit();   
			session.close(); 
		
	}
	
	
	static void delete() {
		
		  SessionFactory sf  = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			
			Session session = sf.openSession();
			session.beginTransaction();
		
		
			Customer ct = (Customer) session.get(Customer.class, 9);

			    if (ct != null) {
			        session.delete(ct);   
			    }

			    session.getTransaction().commit();
			    session.close();
			    sf.close();
	}
	
}

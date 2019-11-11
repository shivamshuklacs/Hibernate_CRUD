package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
 

public class Employee_DAO {
	
	public static void main(String[] args) {
		Employee_DAO.get_data();
	}

	
	public static void insert_data(){
		try {
			
			SessionFactory sessionfactory=new Configuration().configure().buildSessionFactory();
			
			Session session=sessionfactory.openSession();
			
		 	
			Employee obj_Employee=new Employee();
			
		    obj_Employee.setSl_no(2);
			obj_Employee.setEmployee_name("employee two");
			obj_Employee.setMobil_no("2222222");
			
			session.save(obj_Employee);
			
			session.beginTransaction().commit();
			
		    session.close();
		    sessionfactory.close();
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void get_data(){
		try {
			
			SessionFactory sessionfactory=new Configuration().configure().buildSessionFactory();
			
			Session session=sessionfactory.openSession();
			
		 	
			Employee obj_Employee=new Employee();
			
		   
			obj_Employee=(Employee)session.get(Employee.class,2);
			
			System.out.println(obj_Employee.getEmployee_name());
			
			
			session.beginTransaction().commit(); 
			
		    session.close();
		    sessionfactory.close();
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	public static void update(){
		try {
			
			SessionFactory sessionfactory=new Configuration().configure().buildSessionFactory();
			
			Session session=sessionfactory.openSession();
			
		 	
			Employee obj_Employee=new Employee();
			
		   
			obj_Employee.setSl_no(2);
				obj_Employee.setEmployee_name("employee four updated");
				obj_Employee.setMobil_no("33333333 updated");
			
			session.update(obj_Employee);
			
			System.out.println(obj_Employee.getEmployee_name());
			
			
			session.beginTransaction().commit(); 
			
		    session.close();
		    sessionfactory.close();
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	public static void delete(){
		try {
			
			SessionFactory sessionfactory=new Configuration().configure().buildSessionFactory();
			
			Session session=sessionfactory.openSession();
			
		 	
			Employee obj_Employee=new Employee();
			
		   
			obj_Employee.setSl_no(1);
				 
			
			session.delete(obj_Employee);
			
			System.out.println(obj_Employee.getEmployee_name());
			
			
			session.beginTransaction().commit(); 
			
		    session.close();
		    sessionfactory.close();
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
}

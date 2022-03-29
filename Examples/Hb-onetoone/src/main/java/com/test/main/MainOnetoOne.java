package com.test.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import test.modell.Employee;
import test.modell.Phone;

public class MainOnetoOne {
public static void main(String[] args) {
		
		createEmployee();
	}

	public static SessionFactory getSessionFactory() {
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory sessionFactory = configuration
				.buildSessionFactory(builder.build());
		return sessionFactory;
	}

	public static void createEmployee() {
		System.out.println("****************Creating Employee*************");
		Employee emp = new Employee("Dhruv Mehta", 33);
		Phone ph = new Phone();
		ph.setNo("5000045690");
		ph.setEmp(emp);
		emp.setPhone(ph);
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		session.save(emp);
		session.getTransaction().commit();
		session.close();
		System.out.println("Employee Created Successfully" + emp.toString());

	}

}
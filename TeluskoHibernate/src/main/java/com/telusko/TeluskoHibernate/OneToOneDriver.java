package com.telusko.TeluskoHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.telusko.model.Laptop;
import com.telusko.model.Student;

public class OneToOneDriver {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);

		SessionFactory sf = configuration.buildSessionFactory();
		Session session = sf.openSession();
		
		Laptop laptop=new Laptop();
		laptop.setlId(1);
		laptop.setlName("Dell");
		
		Student student=new Student();
		student.setsId(103);
		student.setName("Jaideep");
		
		student.setLaptop(laptop);
		
		Transaction transaction=session.beginTransaction();
		
		
		//session.save(laptop);
		session.save(student);
		
		transaction.commit();
		
		
		
	}

}

package com.telusko.TeluskoHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.telusko.model.Alien;
import com.telusko.model.AlienName;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		AlienName alienName=new AlienName();
		alienName.setFname("Jaideep");
		alienName.setMname("Hareshkumar");
		alienName.setLname("Jagyasi");
		
		Alien alien = new Alien();
// Normal Save
//		alien.setAid(2);
//		alien.setColor("blue");
//		alien.setName("deepa");

		// Object in Oject save

		alien.setAid(2);
		alien.setColor("blue");
		alien.setAname(alienName);

		Configuration configuration = new Configuration().configure().addAnnotatedClass(Alien.class);

		SessionFactory sf = configuration.buildSessionFactory();
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		session.save(alien);

		tx.commit();
	}
}

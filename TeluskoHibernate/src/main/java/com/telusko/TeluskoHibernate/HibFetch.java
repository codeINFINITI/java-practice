package com.telusko.TeluskoHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.telusko.model.Alien;

/**
 * Hello world!
 *
 */
public class HibFetch {
	public static void main(String[] args) {

		Configuration configuration = new Configuration().configure().addAnnotatedClass(Alien.class);

		SessionFactory sf = configuration.buildSessionFactory();
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();
		Alien alien = session.get(Alien.class, 4);
		System.out.println(alien);

		tx.commit();
	}
}

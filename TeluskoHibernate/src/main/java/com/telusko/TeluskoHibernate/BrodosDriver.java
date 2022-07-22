package com.telusko.TeluskoHibernate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.telusko.model.Product;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class BrodosDriver {
	static Session session;
	static {
		Configuration configuration = new Configuration().configure().addAnnotatedClass(Product.class);

		SessionFactory sf = configuration.buildSessionFactory();
		session = sf.openSession();
	}

	public static void main(String[] args) {
		String line = "";
		String splitBy = ";";
		try {

			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Jaideep Jagyasi\\CSVDemo.csv"));
			while ((line = br.readLine()) != null) {
				String[] productStr = line.split(splitBy);

				Product product = new Product();
				Object value = getValue(productStr[0], "INTEGER");
				if (validateValue(value)) {

					product.setArticleNo((Integer) value);
				}

				product.setName(productStr[1]);
				value = getValue(productStr[2], "DOUBLE");
				if (validateValue(value)) {

					product.setPrice((Double) value);
				}
				value = getValue(productStr[3], "INTEGER");
				if (validateValue(value)) {

					product.setStock((Integer) value);
				}
				product.setDescription(productStr[4]);
				try {

					save(product);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

			}
			// read(null, null, null);
		} catch (

		IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Object getValue(String value, String flag) throws Exception {
		try {
			if (flag.equals("INTEGER")) {
				Integer intValue = Integer.valueOf(value);
				return intValue;
			} else if (flag.equals("DOUBLE")) {
				Double doubleValue = Double.valueOf(value);
				return doubleValue;
			}
		} catch (NumberFormatException e) {
			return "NAN";
		}

		catch (Exception e) {
			throw e;
		}
		return null;

	}

	public static boolean validateValue(Object value) {
		if (value != null) {
			if (value.toString().equals("NAN")) {
				System.out.println("Value is not a numeric");
				return false;
			} else {
				return true;
			}

		}
		return false;
	}

	public static void save(Product product) {

		Transaction tx = session.beginTransaction();

		session.persist(product);

		tx.commit();
	}

	public static void read(String name, Integer articleNo, Double price) {

		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Product> cr = cb.createQuery(Product.class);
		Root<Product> root = cr.from(Product.class);
		cr.select(root);

		if (name != null && !name.trim().equals("")) {

			cr.where(cb.equal(root.get("name"), name));
		}
		if (articleNo != null) {

			cr.where(cb.equal(root.get("articleNo"), articleNo));

		}
		Query<Product> query = null;
		if (price != null) {
			query = session.createNativeQuery("select * from product_mst where price<=" + price);

		} else {

			query = session.createQuery(cr);
		}

		List<Product> results = query.getResultList();
		for (Product product : results) {
			System.out.println(product.toString());
		}

	}
}

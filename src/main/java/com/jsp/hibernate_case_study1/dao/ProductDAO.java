package com.jsp.hibernate_case_study1.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import com.jsp.hibernate_case_study1.entity.Cart;
import com.jsp.hibernate_case_study1.entity.Product;

public class ProductDAO {

	Configuration cfg = new Configuration().configure().addAnnotatedClass(Product.class).addAnnotatedClass(Cart.class);
	SessionFactory sf = cfg.buildSessionFactory();


	public String addProduct(Product product) {

		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		session.save(product);
		trans.commit();
		session.close();

		return "Product Successfully added!";
	}
	

	public Product getProductById(int id) {

		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		Product product = session.get(Product.class, id);
		trans.commit();
		session.close();

		return product;
	}


	@SuppressWarnings("unchecked")
	public List<Product> getAllProducts() {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		Query<Product> query =  session.createQuery("from Product");
		List<Product> products = query.getResultList();
		transaction.commit();
		session.close();

		return products;
	}


	public String UpdateProduct(Product product) {

		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		session.update(product);
		trans.commit();
		session.close();

		return "Product Successfully Updated!";

	}


	public String DeleteProduct(Product product) {
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		session.delete(product);;
		trans.commit();
		session.close();

		return "Product Successfully Deleted!";
	}
}



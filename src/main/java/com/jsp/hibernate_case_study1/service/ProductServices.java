package com.jsp.hibernate_case_study1.service;

import java.util.List;
import java.util.Scanner;

import com.jsp.hibernate_case_study1.dao.ProductDAO;
import com.jsp.hibernate_case_study1.entity.Product;


public class ProductServices {

	ProductDAO productDao = new ProductDAO();
	Scanner sc = new Scanner(System.in);


	public void addProduct() {

		System.out.println("Enter Product Name : ");
		String pName = sc.next();

		System.out.println("Enter Product Price : ");
		double pPrice = sc.nextDouble();


		System.out.println("Enter Product Quantity : ");
		int pQuantity = sc.nextInt();

		Product P1 = new Product();
		P1.setProdName(pName);
		P1.setProdPrice(pPrice);
		P1.setProdQuantity(pQuantity);

		String message = productDao.addProduct(P1);

		System.out.println(message);
	}


	public void getProductById() {
		System.out.println("Enter the Product ID to be Fetched : ");
		int id = sc.nextInt();

		Product product = productDao.getProductById(id);
		System.out.println(product);
	}


	public void getAllProducts() {
		List<Product> product = productDao.getAllProducts();
		System.out.println(product);
	}


	public void UpdateProduct() {
		System.out.println("Enter the Product ID to Update : ");
		int id = sc.nextInt();

		Product product = productDao.getProductById(id);
		if (product !=null) {
			System.out.println(product.getProdName()+", "+product.getProdPrice()+", "+product.getProdQuantity());

			System.out.println("Enter Product Name: ");
			String name = sc.next();

			System.out.println("Enter Product Price: ");
			double price = sc.nextDouble();

			System.out.println("Enter Product Name: ");
			int quantity = sc.nextInt();

			product.setProdName(name);
			product.setProdPrice(price);
			product.setProdQuantity(quantity);

			productDao.UpdateProduct(product);
		} else {
			System.out.println("No product found with the given ID!");
		}
	}

	public void DeleteProduct() {
		System.out.println("Enter the Product ID to Delete: ");
		int id = sc.nextInt();

		Product product = productDao.getProductById(id);

		if (product != null) {
			String message = productDao.DeleteProduct(product);
			System.out.println(message);
		} else {
			System.out.println("No product found with the given ID!");
		}
	}

}
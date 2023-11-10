package com.jsp.hibernate_case_study1.service;

import java.util.Scanner;

import com.jsp.hibernate_case_study1.dao.CartDAO;
import com.jsp.hibernate_case_study1.dao.ProductDAO;
import com.jsp.hibernate_case_study1.entity.Cart;
import com.jsp.hibernate_case_study1.entity.Product;

public class CartServices {
	Scanner sc = new Scanner(System.in);
	CartDAO cartDAO = new CartDAO();
	ProductDAO productDAO = new ProductDAO();
	
	public void createCart() {
		System.out.println("Enter the cart id to create : ");
		int id = sc.nextInt();
		Cart cart = new Cart();
		cart.setCartId(id);
		String message = cartDAO.createCart(cart);
		System.out.println(message);
	}
	
	public void addProductToCart() {
		System.out.println("Enter the product id to add to the cart : ");
		int id = sc.nextInt();
		Product product = productDAO.getProductById(id);
		String message = cartDAO.addProductToCart(product);
		System.out.println(message);
	}
	
	public void removeProductFromCart() {
		System.out.println("Enter the product id to remove from the cart : ");
		int id = sc.nextInt();
		Product product = productDAO.getProductById(id);
		String message = cartDAO.removeProductFromCart(product);
		System.out.println(message);
	}
	
}
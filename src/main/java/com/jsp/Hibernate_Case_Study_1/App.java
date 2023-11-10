package com.jsp.Hibernate_Case_Study_1;

import java.util.Scanner;

import com.jsp.hibernate_case_study1.service.CartServices;
import com.jsp.hibernate_case_study1.service.ProductServices;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
//    System.out.println("Enter :\n"
//    		+"1. To  addProduct \n"
//    		+"2. To  getProductById \n"
//    		+"3. To  getAllProducts\n"
//    		+"4. To  updateProduct\n"
//    		+"5. To  deletProduct\n"
//    		+"6. To  Terminate");
//    
//    Scanner input = new Scanner(System.in);
//	int choice = input.nextInt();
//
//	ProductServices ps = new ProductServices();
//
//	switch (choice) {
//	case 1:
//		ps.addProduct();
//		break;
//	case 2:
//		ps.getProductById();
//		break;
//	case 3:
//		ps.getAllProducts();
//		break;
//	case 4:
//		ps.UpdateProduct();
//		break;
//	case 5:
//		ps.DeleteProduct();
//	case 6:
//		System.out.println("Program terminated!!");
//	default:
//		System.out.println("Invalid Input!!");
//		break;
//	}
//	input.close();
//    }
//}

 
    
	 System.out.println("Enter :\n"
	    		+"1. To  createCart \n"
	    		+"2. To  addProductToCart \n"
	    		+"3. To  removeProductFromCart\n"
	    		+"4. To  Terminate");
	 
	  Scanner input = new Scanner(System.in);
		int choice = input.nextInt();

		CartServices cs = new CartServices();

		switch (choice) {
		case 1:
			cs.createCart();
			break;
		case 2:
			cs.addProductToCart();
			break;
		case 3:
			cs.removeProductFromCart();
			break;
		case 4:
			System.out.println("Program terminated!!");
		default:
			System.out.println("Invalid Input!!");
			break;
		}
		input.close();
	}	
}



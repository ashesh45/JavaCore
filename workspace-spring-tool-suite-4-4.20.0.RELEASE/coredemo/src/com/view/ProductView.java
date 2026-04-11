package com.view;

import java.util.List;
import java.util.Scanner;

import com.model.Product;
import com.service.ProductService;
import com.service.ProductServiceImpl;

public class ProductView {
	
	static ProductService service = new ProductServiceImpl(); // ✅ GLOBAL
    static Scanner sc = new Scanner(System.in);
    

    public static void main(String[] args) {
    	 
       // add();
       getAll();
        //delete();
    }
 
    // add product
    static void add() {

        //ProductService service = new ProductServiceImpl();
        char flag = 'y';
        Scanner sc = new Scanner(System.in);
      
        do {
            Product pd = new Product();

            System.out.println("Enter id:");
            pd.setId(sc.nextInt());

            System.out.println("Enter Name:");
            pd.setName(sc.next());
            
            System.out.println("Enter Company:");
            pd.setCompany(sc.next());

            System.out.println("Enter price:");
            pd.setPrice(sc.nextInt());

            service.addProduct(pd);

            System.out.println("Do you want to add more? (y/n)");
            flag = sc.next().charAt(0);

        } while (flag == 'y');
    }

    // get all products
    static void getAll()
    {
    	//ProductService service = new ProductServiceImpl();
    	List<Product> plist = service.getAllProducts();
    	System.out.println(plist);
    }


    // delete product
    static void delete()

    {
    	 System.out.println("Enter product ID to delete:");
         int id = sc.nextInt();

         service.deleteProduct(id);

         System.out.println("After deletion:");
         getAll();
    	
    }
}

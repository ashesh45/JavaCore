package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.Product;
import com.utility.DBConnection;


public class ProductServiceImpl implements ProductService{

	Connection con = DBConnection.getConnection();
	static List<Product> plist = new ArrayList<>();

	@Override
	public void addProduct(Product p)  {
		// TODO Auto-generated method stub
		try {
		 String sql = "INSERT INTO product(ProductName, company,price) VALUES ('Charger', 'intel',12300)";
		 Statement stm = con.createStatement();
		 stm.executeUpdate(sql);
		 System.out.println("Data inserted successfully!");
		}catch (Exception e) {
            e.printStackTrace();
        }
		// con.close();


	}

	@Override
	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		try {
		String sql = "DELETE from product where id ="+id;
	  Statement stm = con.createStatement();
        stm.execute(sql);
        con.close();
        System.out.println("Data Deleted sucessfullu");
		}catch (Exception e) {
            e.printStackTrace();
        }
	}

	   
	@Override
	public List<Product> getAllProducts() {

	    List<Product> list = new ArrayList<>();   
	    try {
	        String sql = "select * from product";
	        Statement stm = con.createStatement();
	        ResultSet rs = stm.executeQuery(sql);

	        while (rs.next()) {

	            Product p = new Product();   

	            p.setId(rs.getInt("id"));
	            p.setName(rs.getString("productname"));
	            p.setPrice(rs.getInt("price"));

	            list.add(p);   
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return list;   
	}
}


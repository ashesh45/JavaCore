package com.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.Product;
import com.utility.DBConnection;

public class ProductServiceImpl implements ProductService {

	Connection con = DBConnection.getConnection();
	static List<Product> plist = new ArrayList<>();
	
	
	
	@Override
	public void addProduct(Product p) {
	    try {
	        String sql = "INSERT INTO product(name, company, price) VALUES (?, ?, ?)"; 

	        PreparedStatement ps = con.prepareStatement(sql);
	        ps.setString(1, p.getName());
	        ps.setString(2, p.getCompany());
	        ps.setDouble(3, p.getPrice()); 

	        ps.executeUpdate();

	        System.out.println("Data inserted successfully!");

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
		
	
	@Override
	public void deleteProduct(int id) {
	    try {
	        String sql = "DELETE FROM product WHERE id=?";
	        PreparedStatement ps = con.prepareStatement(sql);

	        ps.setInt(1, id);

	        ps.executeUpdate();
	        System.out.println("Data deleted successfully!");

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		List<Product> list = new ArrayList<>();   
	    try {
	        String sql = "select * from product";
	        Statement stm = con.createStatement();
	        ResultSet rs = stm.executeQuery(sql);

	        while (rs.next()) {

	            Product p = new Product();   

	            p.setId(rs.getInt("id"));
	            p.setName(rs.getString("name"));
	            p.setCompany(rs.getString("company"));
	            p.setPrice(rs.getInt("price"));

	            list.add(p);   
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return list;   
	}



	@Override
	public List<Product> searchProduct(String sdata) {
		// TODO Auto-generated method stub
		List<Product> list = new ArrayList<>();   
	    try {
	        String sql = "select * from product where name like '%"+sdata+"%' OR company like '%"+sdata+"%'  ";
	        Statement stm = con.createStatement();
	        ResultSet rs = stm.executeQuery(sql);

	        while (rs.next()) {

	            Product p = new Product();   

	            p.setId(rs.getInt("id"));
	            p.setName(rs.getString("name"));
	            p.setCompany(rs.getString("company"));
	            p.setPrice(rs.getInt("price"));

	            list.add(p);   
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return list;   
	}


	@Override
	public void updateProduct(Product p) {
		// TODO Auto-generated method stub

		 try {
		        String sql = "UPDATE product SET name=?, company=?, price=? WHERE id=?";
		        PreparedStatement ps = con.prepareStatement(sql);
		        ps.setString(1, p.getName());
		        ps.setString(2, p.getCompany());
		        ps.setDouble(3, p.getPrice());
		        ps.setInt(4, p.getId());

		        ps.executeUpdate();

		        System.out.println("Data inserted successfully!");

		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		
		
		
		 }
	}



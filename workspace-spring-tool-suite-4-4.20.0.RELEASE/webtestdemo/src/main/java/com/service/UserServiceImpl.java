package com.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.data.DBconnection;
import com.model.User;


public class UserServiceImpl implements UserService {
	
	Connection con = DBconnection.getConnection();
	static List<User> ulist = new ArrayList<>();

	
	@Override
	public void signup(User user) {

		  try {
		        String sql = "INSERT INTO usertable(username, email, password) VALUES (?, ?, ?)"; 

		        PreparedStatement ps = con.prepareStatement(sql);
		        ps.setString(1, user.getUsername());
		        ps.setString(2, user.getEmail());
		        ps.setString(3, user.getPassword()); 

		        ps.executeUpdate();

		        System.out.println("Data inserted successfully!");

		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		}
	@Override
	public boolean login(String un, String psd) {

	    boolean status = false;

	    String sql = "SELECT * FROM usertable WHERE username=? AND password=?";

	    try (Connection con = DBconnection.getConnection();
	         PreparedStatement ps = con.prepareStatement(sql)) {

	        ps.setString(1, un);
	        ps.setString(2, psd);

	        ResultSet rs = ps.executeQuery();

	        if (rs.next()) {
	            status = true;
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return status;
	}
	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		List<User> list = new ArrayList<>();   
	    try {
	        String sql = "select * from usertable";
	        Statement stm = con.createStatement();
	        ResultSet rs = stm.executeQuery(sql);

	        while (rs.next()) {

	            User p = new User();   

	            p.setId(rs.getInt("id"));
	            p.setUsername(rs.getString("username"));
	            p.setEmail(rs.getString("email"));
	            p.setPassword(rs.getString("password"));

	            list.add(p);   
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return list;
	}

}

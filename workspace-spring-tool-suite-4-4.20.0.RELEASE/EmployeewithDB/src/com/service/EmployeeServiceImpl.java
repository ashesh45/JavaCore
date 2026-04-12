package com.service;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.Employee;
import com.utility.DBconnection;





public class EmployeeServiceImpl implements EmployeeService {
   
	Connection con = DBconnection.getConnection();
	static List<Employee> elist = new ArrayList<>();
	
	
	@Override
	public void addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		try {
			 String sql = "INSERT INTO employee(Name, address,salary) VALUES ('aayush', 'yala',15550)";
			 Statement stm = con.createStatement();
			 stm.executeUpdate(sql);
			 System.out.println("Data inserted successfully!");
			}catch (Exception e) {
	            e.printStackTrace();
	        }
			// con.close();
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		try {
			String sql = "DELETE from employee where id ="+id;
		  Statement stm = con.createStatement();
	        stm.execute(sql);
	        con.close();
	        System.out.println("Data Deleted sucessfullu");
			}catch (Exception e) {
	            e.printStackTrace();
	        }
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		 List<Employee> list = new ArrayList<>();   
		    try {
		        String sql = "select * from employee";
		        Statement stm = con.createStatement();
		        ResultSet rs = stm.executeQuery(sql);

		        while (rs.next()) {

		            Employee emp = new Employee();   

		            emp.setId(rs.getInt("id"));
		            emp.setName(rs.getString("name"));
		            emp.setAddress(rs.getString("address"));
		            emp.setSalary(rs.getDouble("salary"));

		            list.add(emp);   
		        }

		    } catch (Exception e) {
		        e.printStackTrace();
		    }

		    return list;   
		}
	

	@Override
	public void updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		try {
	        String sql = "UPDATE employee SET Name='" + emp.getName() +
	                     "', address='" + emp.getAddress() +
	                     "', salary=" + emp.getSalary() +
	                     " WHERE id=" + emp.getId();

	        Statement stm = con.createStatement();
	        stm.executeUpdate(sql);

	        con.close();
	        System.out.println("Data Updated Successfully");

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
}
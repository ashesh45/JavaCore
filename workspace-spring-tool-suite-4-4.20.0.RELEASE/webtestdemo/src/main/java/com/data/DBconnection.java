package com.data;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
	
	
	public static Connection getConnection() {

        Connection con = null;
         try {
            // 1. Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Create connection
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/user",
                    "root",
                    "root"
            );

        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }
}

package com.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	public static Connection getConnection() {

        Connection con = null;
         try {
            // 1. Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Create connection
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/ashesh",
                    "root",
                    "root"
            );

        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }

}

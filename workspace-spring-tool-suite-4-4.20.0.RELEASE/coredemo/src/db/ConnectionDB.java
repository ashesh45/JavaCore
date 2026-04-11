 package db;
 import java.sql.Connection;
 import java.sql.DriverManager;
 import java.sql.ResultSet;
 import java.sql.SQLException;
 import java.sql.Statement;

public class ConnectionDB{
	
	
	public static Connection getConnection() {

        Connection con = null;

        try {
            // 1. Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Create connection
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/javaprog",
                    "root",
                    "root"
            );

        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }
	
	
	
	
	
	
	
	
	

//    public static void main(String[] args) throws ClassNotFoundException,SQLException {
//
//     
//        	// 1. Load MySQL driver
//            Class.forName("com.mysql.cj.jdbc.Driver");
//
//            // 2. Create connection
//            Connection con = DriverManager.getConnection(
//                    "jdbc:mysql://localhost:3306/ashesh",
//                "root",
//                 "root"
//            );
//        
//            
//
////            // 3. Create SQL query
//            String sql = "INSERT INTO user(username, password) VALUES ('sabin', 'sabin093')";
//
//            // 4. Create statement
//            Statement stmt = con.createStatement();
//
//            // 5. Execute query
//            stmt.executeUpdate(sql);
//
//            System.out.println("Data inserted successfully!");
//
//            // 6. Close connection
//            con.close();
//
//        
//        
//        
//           //update sql
////             String sql = "UPDATE user set password ='meroghr32' where id =1";
////             Statement stm = con.createStatement();
////             stm.execute(sql);
////               con.close();
////               System.out.println("Data updated sucessfullu");
////            
////            //Delete query 
////        
////        String sql = "DELETE from user where id =6";
////            Statement stm = con.createStatement();
////        stm.execute(sql);
////        con.close();
////         System.out.println("Data Deleted sucessfullu");
////         
////            //select 
////         String sql = "select * from user";
////            Statement stm = con.createStatement();
////            ResultSet rs = stm.executeQuery(sql);
////            while (rs.next()) {
////            	System.out.println(""+ rs.getInt("id"));
////            	System.out.println(""+ rs.getString("username"));
////            	System.out.println(""+ rs.getString("password"));
////            	
////            }
//     }   
}
package connectiondata;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import com.mysql.jdbc.Driver;

public class ConnectionDatabase {
	
	    public Connection getConnection() {
	    	 System.out.println("Conectando ao banco");
	        try {
	        	 DriverManager.registerDriver(new com.mysql.jdbc.Driver()); 
	            return DriverManager.getConnection(
	          "jdbc:mysql://localhost/SBL", "root", "senha");
	        } catch (SQLException e) {
	            throw new RuntimeException(e);
	        }
	    }
	
}
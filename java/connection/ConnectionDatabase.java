package connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class ConnectionDatabase {
	
	    public Connection getConnection() {
	    	 System.out.println("Conectando ao banco");
	        try {
	            return DriverManager.getConnection(
	          "jdbc:mysql://localhost/musica", "root", "senha");
	        } catch (SQLException e) {
	            throw new RuntimeException(e);
	        }
	    }
	
}

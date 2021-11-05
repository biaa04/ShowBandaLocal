package connectiondata;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConeccao {
	public static void main(String[] args) throws SQLException {
		
		
			Connection connection = new ConnectionDatabase().getConnection();
		
		      System.out.println("Conexão aberta!");
		      connection.close();
		      
		
	}

}

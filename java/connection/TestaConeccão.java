package connection;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConeccão {
	public static void main(String[] args) throws SQLException, ClassNotFoundException  {
		
		
			Connection connection = new ConnectionDatabase().getConnection();
		
		      System.out.println("Conexão aberta!");
		      connection.close();
		      
		
	}

}

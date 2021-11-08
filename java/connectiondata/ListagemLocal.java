package connectiondata;

import java.sql.SQLException;
import java.util.List;


public class ListagemLocal {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ContatoDao dao = new ContatoDao();
		List<Dados> locais =  dao.getLista();
	  for(Dados dado : locais) {
		  System.out.println("Localidade: "+dado.getLocalidade());
		  System.out.println("Capacidade:" +dado.getCapacidade());
		  
	  }
	}

}

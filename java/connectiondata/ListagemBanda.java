package connectiondata;

import java.sql.SQLException;
import java.util.List;
//import connectiondata.Dados;

public class ListagemBanda {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ContatoDao dao = new ContatoDao();
		List<Dados> bandas =  dao.getLista();
	  for(Dados dado : bandas) {
		  System.out.println("Nome: "+dado.getNome());
		  System.out.println("Genero:" +dado.getGenero());
		  
	  }
	}

}
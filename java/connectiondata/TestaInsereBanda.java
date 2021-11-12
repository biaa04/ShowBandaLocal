package connectiondata;

import java.sql.SQLException;


public class TestaInsereBanda {
	
	
	public static void main(String[]args) throws ClassNotFoundException, SQLException {
		Dados dados = new Dados();
		dados.setNome("Aviões do Forró");
		dados.setGenero("Forró");
		
		
		DadosDao dao = new DadosDao();
		dao.adiciona(dados);
		System.out.println("Gravado!");
	}


}

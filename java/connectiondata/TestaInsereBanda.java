package connectiondata;

import java.sql.SQLException;


public class TestaInsereBanda {
	public static void main(String[]args) throws ClassNotFoundException, SQLException {
		Dados dados = new Dados();
		dados.setNome("Avões do Forró");
		dados.setGenero("Forró");
		
		
		ContatoDao dao = new ContatoDao();
		dao.adiciona(dados);
		System.out.println("Gravado!");
	}


}

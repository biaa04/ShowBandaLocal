package connectiondata;

import java.sql.SQLException;

public class TestaAlteraBanda {
	public static void main(String[]args) throws ClassNotFoundException, SQLException {
		Dados dados = new Dados();
		dados.setNome("BTS");
		dados.setGenero("POP");
		
		
		ContatoDao dao = new ContatoDao();
		dao.altera(dados);
		System.out.println("Alterado!");
	 }

}

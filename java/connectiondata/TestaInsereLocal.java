package connectiondata;

import java.sql.SQLException;

public class TestaInsereLocal {
	public static void main(String[]args) throws ClassNotFoundException, SQLException {
		Dados dados = new Dados();
		dados.setLocalidade("Arena Castelão");
		dados.setCapacidade("10000");
		
		
		ContatoDao dao = new ContatoDao();
		dao.adicionaLocal(dados);
		System.out.println("Gravado!");
	}


}

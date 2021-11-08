package connectiondata;

import java.sql.SQLException;

public class TestaDeleteLocal {
	public static void main(String[]args) throws ClassNotFoundException, SQLException {
		Dados dados = new Dados();
		dados.setLocalidade("Arenaa Castelão");
		//dados.setCapacidade(10);
		
		
		ContatoDao dao = new ContatoDao();
		dao.removeLocal(dados);
		System.out.println("Deletado!");
	}


}

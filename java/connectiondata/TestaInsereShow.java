package connectiondata;

import java.sql.SQLException;
import java.util.Calendar;

public class TestaInsereShow {
	public static void main(String[]args) throws ClassNotFoundException, SQLException {
		Dados dados = new Dados();
		dados.setData(Calendar.getInstance());
		
		
		ContatoDao dao = new ContatoDao();
		dao.adicionaLocal(dados);
		System.out.println("Gravado!");
	}

}
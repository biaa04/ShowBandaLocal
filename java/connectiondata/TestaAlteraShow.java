package connectiondata;

import java.sql.SQLException;
import java.util.Calendar;

public class TestaAlteraShow {
	public static void main(String[]args) throws ClassNotFoundException, SQLException {
		Dados dados = new Dados();
		dados.setData(Calendar.getInstance());
		
		
		
		DadosDao dao = new DadosDao();
		dao.alteraLocal(dados);
		System.out.println("Alterado!");
	 }

}
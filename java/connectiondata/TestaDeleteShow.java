package connectiondata;

import java.sql.SQLException;
import java.util.Calendar;

public class TestaDeleteShow {
	public static void main(String[]args) throws ClassNotFoundException, SQLException {
		Dados dados = new Dados();
		dados.setData(Calendar.getInstance());
		
		
		
		DadosDao dao = new DadosDao();
		dao.removeLocal(dados);
		System.out.println("Deletado!");

}
}

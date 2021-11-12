package connectiondata;

import java.sql.SQLException;

public class TestaAlteraLocal{
	public static void main(String[]args) throws ClassNotFoundException, SQLException {
	Dados dados = new Dados();

	dados.setLocalidade("Marcelo");
	dados.setCapacidade("8");
	
	
	
	
	DadosDao dao = new DadosDao();
	dao.alteraLocal(dados);
	System.out.println("Alterado!");
 }
}

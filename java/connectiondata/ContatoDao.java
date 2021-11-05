package connectiondata;


//Falta fazer os métodos adicionar,alterar, remover e a listagem do show 



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContatoDao {
	private Connection connection;
	
	public ContatoDao() {
		this.connection = new ConnectionDatabase().getConnection();
	}
	//Adiciona-Banda
	public void adiciona(Dados dados) {
		String sql = "insert into bandas " + "(nome,genero)" + " values (?,?)";

		try {

			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1,dados.getNome());
			stmt.setString(2,dados.getGenero());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	//Adiciona-Local
	public void adicionaLocal(Dados dados) {
		String sql = "insert into dados " + "(nomeL,capacidade)" + " values (?,?)";

		try {

			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1,dados.getLocalidade());
			stmt.setLong(2,dados.getCapacidade());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	//Listagem-Banda
	 public List<Dados> getLista() {
	      try {
	          List<Dados> dados = new ArrayList<Dados>();
	          PreparedStatement stmt = this.connection.
	                  prepareStatement("select * from Bandas");
	          ResultSet rs = stmt.executeQuery();

	          while (rs.next()) {
	              
	              Dados dado = new Dados();
	              
	              dado.setNome(rs.getString("nome"));
	              dado.setGenero(rs.getString("genero"));
	              

	             
	              
	               dados.add(dado);
	          }
	          rs.close();
	          stmt.close();
	          return dados;
	      } catch (SQLException e) {
	          throw new RuntimeException(e);
	      }
	  }
	 
	//Listagem-Local
		 public List<Dados> getListaLocais() {
		      try {
		          List<Dados> dados = new ArrayList<Dados>();
		          PreparedStatement stmt = this.connection.
		                  prepareStatement("select * from Locais");
		          ResultSet rs = stmt.executeQuery();

		          while (rs.next()) {
		              
		              Dados dado = new Dados();
		              
		              dado.setLocalidade(rs.getString("localidade"));
		              dado.setCapacidade(rs.getLong("capacidade"));
		              

		             
		              
		               dados.add(dado);
		          }
		          rs.close();
		          stmt.close();
		          return dados;
		      } catch (SQLException e) {
		          throw new RuntimeException(e);
		      }
		  }
	 
	 //Altera-Banda
	 public void altera(Dados dados) {
	      String sql = "update contatos set nome=?, genero=?";
	              

	      try {
	          PreparedStatement stmt = connection
	                  .prepareStatement(sql);
	          stmt.setString(1, dados.getNome());
	          stmt.setString(2, dados.getGenero());
	          
	          stmt.execute();
	          stmt.close();
	      } catch (SQLException e) {
	          throw new RuntimeException(e);
	      }
	  }
	//Altera-Local
		 public void alteraLocal(Dados dados) {
		      String sql = "update contatos set localidade=?, capacidade=?";
		              

		      try {
		          PreparedStatement stmt = connection
		                  .prepareStatement(sql);
		          stmt.setString(1, dados.getLocalidade());
		          stmt.setLong(2, dados.getCapacidade());
		          
		          stmt.execute();
		          stmt.close();
		      } catch (SQLException e) {
		          throw new RuntimeException(e);
		      }
		  }
	 //Remove-Banda
	 public void remove(Dados dados) {
	      try {
	          PreparedStatement stmt = connection
	                  .prepareStatement("delete from contatos where nome=?");
	          stmt.setString(1, dados.getNome());
	          stmt.setString(2, dados.getGenero());
	          stmt.execute();
	          stmt.close();
	      } catch (SQLException e) {
	          throw new RuntimeException(e);
	      }
	  }
	 
	//Remove-Local
		 public void removeLocal(Dados dados) {
		      try {
		          PreparedStatement stmt = connection
		                  .prepareStatement("delete from contatos where localidade=?");
		          stmt.setString(1, dados.getLocalidade());
		          stmt.setLong(2, dados.getCapacidade());
		          stmt.execute();
		          stmt.close();
		      } catch (SQLException e) {
		          throw new RuntimeException(e);
		      }
		  }



}

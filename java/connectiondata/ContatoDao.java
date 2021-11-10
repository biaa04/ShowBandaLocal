package connectiondata;


 



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
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
		String sql = "insert into locais " + "(localidade,capacidade)" + " values (?,?)";

		try {

			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1,dados.getLocalidade());
			stmt.setString(2,dados.getCapacidade());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	//Adiciona-Show
			public void adicionaShow(Dados dados) {
				String sql = "insert into shows " + "(data)" + " values (?)";

				try {

					PreparedStatement stmt = connection.prepareStatement(sql);

					stmt.setDate(1, (java.sql.Date) new Date(dados.getData().getTimeInMillis()));
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
	                  prepareStatement("select * from bandas");
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
		                  prepareStatement("select * from locais");
		          ResultSet rs = stmt.executeQuery();

		          while (rs.next()) {
		              
		              Dados dado = new Dados();
		              
		              dado.setLocalidade(rs.getString("localidade"));
		              dado.setCapacidade(rs.getString("capacidade"));
		              

		             
		              
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
	      String sql = "update bandas set nome=?, genero=?";
	              

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
		      String sql = "update  locais set  localidade=? for localidade=?";
		              

		      try {
		          PreparedStatement stmt = connection
		                  .prepareStatement(sql);
		          stmt.setString(1, dados.getLocalidade());
		          stmt.setString(2, dados.getCapacidade());
		        
		          
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
	                  .prepareStatement("delete from bandas where nome=?");
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
		                  .prepareStatement("delete from locais where localidade=?");
		          stmt.setString(1, dados.getLocalidade());
		         // stmt.setInt(2, dados.getCapacidade());
		          stmt.execute();
		          stmt.close();
		      } catch (SQLException e) {
		          throw new RuntimeException(e);
		      }
		  }



}

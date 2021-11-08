package banda;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connectiondata.ContatoDao;
import connectiondata.Dados;

@WebServlet("/formBanda")
public class Banda extends HttpServlet{
	private int id;

	
	protected void service(HttpServletRequest req,
            HttpServletResponse resp)
            throws IOException,ServletException{
      PrintWriter out = resp.getWriter();
      
      String nome = req.getParameter("nome");
      String genero = req.getParameter("genero");
      
      Dados  dados = new Dados();
      dados.setNome(nome);
      dados.setGenero(genero);
      
      ContatoDao dao = new ContatoDao();
      dao.adiciona(dados);
      
      out.println("<html>");
      out.println("<body>");
      out.println("Banda " + dados.getNome() +
              " adicionada com sucesso");
      out.println("</body>");
      out.println("</html>");
      
	}
}
	
	
		
	



package banda;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connectiondata.ContatoDao;
import connectiondata.Dados;

@WebServlet("/formBanda")
public class Banda extends HttpServlet{
	
	protected void service(HttpServletRequest request,
            HttpServletResponse response)
            throw IOException,ServletException{
      PrintWrite out = response getWriter();
      String nome = request.getParameter("nome");
      String genero = request.getParameter("genero");
      
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
	
	
	
		
	



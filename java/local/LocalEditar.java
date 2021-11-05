package local;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connectiondata.ContatoDao;
import connectiondata.Dados;

@WebServlet("/formLocalEditar")
public class LocalEditar {
	protected void service(HttpServletRequest request,
            HttpServletResponse response)
            throw IOException,ServletException{
      PrintWrite out = response getWriter();
      String localidade = request.getParameter("localidade");
      String capacidade = request.getParameter("capacidade");
      
      Dados  dados = new Dados();
      dados.setNomeL(localidade);
      dados.setCapacidade(capacidade);
      
      ContatoDao dao = new ContatoDao();
      dao.adiciona(dados);
      out.println("<html>");
      out.println("<body>");
      out.println("Banda " + dados.getNome() +
              " adicionada com sucesso");
      out.println("</body>");
      out.println("</html>");
      
	}

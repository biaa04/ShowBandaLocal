package local;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import connectiondata.DadosDao;
import connectiondata.Dados;

@WebServlet("/formLocal")
public class LocalDAO extends HttpServlet{
	
	protected void service(HttpServletRequest req,
            HttpServletResponse resp)
            throws IOException,ServletException{
      PrintWriter out = resp.getWriter();
      String localidade = req.getParameter("localidade");
      String capacidade = req.getParameter("capacidade");
      
      Dados  dados = new Dados();
      dados.setLocalidade(localidade);
      dados.setCapacidade(capacidade);
      
      DadosDao dao = new DadosDao();
      dao.adiciona(dados);
      out.println("<html>");
      out.println("<body>");
      out.println("A localidade " + dados.getLocalidade() +
              " adicionada com sucesso");
      out.println("</body>");
      out.println("</html>");
      
	}
}
	
	


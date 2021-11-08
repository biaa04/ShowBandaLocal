package show;

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


public class Show {
	protected void service(HttpServletRequest req,
            HttpServletResponse resp)
            throws IOException,ServletException{
      PrintWriter out = resp.getWriter();
      String nome = req.getParameter("nome");
      String genero = req.getParameter("genero");
      String localidade = req.getParameter("localidade");
      String capacidade = req.getParameter("capacidade");
      
      Dados  dados = new Dados();
      dados.setNome(nome);
      dados.setGenero(genero);
      dados.setLocalidade(localidade);
      dados.setCapacidade(capacidade);
      
      ContatoDao dao = new ContatoDao();
      dao.adiciona(dados);
      out.println("<html>");
      out.println("<body>");
      out.println("A localidade " + dados.getLocalidade() +
              " adicionada com sucesso");
      out.println("</body>");
      out.println("</html>");
      

}
}

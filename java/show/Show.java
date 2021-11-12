package show;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connectiondata.DadosDao;
import connectiondata.Dados;

@WebServlet("/formShows")
public class Show {
	protected void service(HttpServletRequest req,
            HttpServletResponse resp)
            throws IOException,ServletException{
      PrintWriter out = resp.getWriter();
     // String nome = req.getParameter("nome");
     
      Dados  dados = new Dados();
      //dados.setNome(nome);
      String dataEmTexto = req.getParameter("data");
      Calendar data = null;

      // fazendo a conversão da data
      try {
          Date date = (Date) new SimpleDateFormat("dd/MM/yyyy")
                .parse(dataEmTexto);
          data = Calendar.getInstance();
          data.setTime(date);
      } catch (ParseException e) {
          out.println("Erro de conversão da data");
          return; //para a execução do método
      }
      DadosDao dao = new DadosDao();
      dao.adiciona(dados);
      out.println("<html>");
      out.println("<body>");
      out.println("Show " + dados.getData() +
              " adicionada com sucesso");
      out.println("</body>");
      out.println("</html>");
      

}
}

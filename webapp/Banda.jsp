<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@  page import = "java.util.*,
     connectiondata.*" %>
 <table>
    <%
    DadosDao dao = new DadosDao();
          List<Dados> bandas = dao.getListaBandas();

          for (Dados dado : bandas ) {
    %>
      <tr>
        <td><%=dado.getNome() %></td>
        <td><%=dado.getGenero() %></td>
       
      </tr>
     <%
      }
    %>
  </table>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@  page import = "java.util.*,
     connectiondata.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

    
 <fieldset>
 <legend>Pesquisar</legend>
 <input type="text" name="pesquisar" value="${param.pesquisar}"/>
 <input type="submit" value="Pesquisar"/>
 </fieldset>
 
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
  
  <table>
    <%
    DadosDao dao2 = new DadosDao();
          List<Dados> locais = dao2.getListaBandas();

          for (Dados dado : locais ) {
    %>
      <tr>
        <td><%=dado.getLocalidade() %></td>
        <td><%=dado.getCapacidade() %></td>
    
      </tr>
     <%
      }
    %>
  </table>
  
  <table>
    <%
    DadosDao dao3 = new DadosDao();
          List<Dados> shows = dao3.getListaBandas();

          for (Dados dado : shows ) {
    %>
      <tr>
        <td><%=dado.getData() %></td>   
      </tr>
     <%
      }
    %>
  </table>
  

</body>
</html>
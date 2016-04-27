<html>
<%@ page pageEncoding="UTF-8" %>
<%

String author = request.getParameter("author");
if ( author != null ) {
    String title = request.getParameter("title");
    String year = request.getParameter("year");
    out.print("Auteur : "+author+"<br/>");
    out.print("Titre : "+title+"<br/>");
    out.print("Ann&eacute; : "+year+"<br/><p/>");
}

%>

<form action="form.jsp">
    Titre:<input type="text" name="title" value="<%=request.getParameter("title")%>"><br />
    Année:<input type="text" name="year" value="<%=request.getParameter("year")%>"><br />
    Auteur:<input type="text" name="author" value="<%=request.getParameter("author")%>"><br />
<input type="submit">
</form>
</html>

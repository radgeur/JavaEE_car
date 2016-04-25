<!DOCTYPE html>
<html>
    <head>
        <title>Reception</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <%@ page pageEncoding="UTF-8" %>
    </head>
    <body>
        <form action="formulaire.jsp">
            Titre:<input type="text" name="titre" value="<%=request.getParameter("titre")%>"><br />
            Auteur:<input type="text" name="auteur" value="<%=request.getParameter("auteur")%>"><br />
            Année:<input type="text" name="annee" value="<%=request.getParameter("annee")%>"><br />
            <input type="submit" value="valider"><br />
        </form>
    </body>
</html>

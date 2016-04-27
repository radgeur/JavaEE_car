<!DOCTYPE html>
<html>
    <%@ page pageEncoding="UTF-8" %>
    <body>
    	<a href="./displaybooks">Afficher la liste des livres</a><br />
    	<a href="./formulaire.html">Retour au formulaire</a><br />
    	<%
            String authors = (String) request.getAttribute("authors");
            out.println(authors);
        %>
    </body>
</html>
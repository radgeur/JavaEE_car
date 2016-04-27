<!DOCTYPE html>
<html>
    <%@ page pageEncoding="UTF-8" %>
    <body>
    	<a href="./displayauthors">Afficher la liste des auteurs</a><br />
    	<a href="./formulaire.html">Retour au formulaire</a><br />
    	<%
            String books = (String) request.getAttribute("books");
            out.println(books);
        %>
    </body>
</html>
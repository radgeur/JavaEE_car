<!DOCTYPE html>
<html>
    <%@ page pageEncoding="UTF-8" %>
    <body>
    	<%
            String books = (String) request.getAttribute("books");
            out.println(books);
        %>
    	<a href="./displayauthors">Afficher la liste des auteurs</a><br />
    	<a href="./formulaire.html">Retour au formulaire</a><br />
    	<a href="./connexion">Connexion</a><br />
    	<%
    		String lien =  (String) request.getAttribute("session");
    		out.println(lien);
    	%>
    </body>
</html>
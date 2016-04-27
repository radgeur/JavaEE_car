<!DOCTYPE html>
<html>
    <%@ page pageEncoding="UTF-8" %>
    <body>
    	<%
            String authors = (String) request.getAttribute("authors");
            out.println(authors);
        %>
    	<a href="./displaybooks">Afficher la liste des livres</a><br />
    	<a href="./formulaire.html">Retour au formulaire</a><br />
    	<%
    		String lien =  (String) request.getAttribute("session");
    		out.println(lien);
    	%>
    </body>
</html>
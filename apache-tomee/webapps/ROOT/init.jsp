<!DOCTYPE html>
<html>
    <%@ page pageEncoding="UTF-8" %>
    <body>
    
    	<p>La liste a bien été initialisée</p>
    	<a href="./displaybooks">Afficher la liste des livres</a><br />
    	<a href="./displayauthors">Afficher la liste des auteurs</a> <br />
    	<a href="./formulaire.html">Retour au formulaire</a><br />
    	<%
    		String lien =  (String) request.getAttribute("session");
    		out.println(lien);
    	%>
    </body>
</html>

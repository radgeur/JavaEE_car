<!DOCTYPE html>
<html>
    <%@ page pageEncoding="UTF-8" %>
    <body>
        <form action="/registerbook">
            Titre:<input type="text" name="titre" value="<%=request.getParameter("titre")%>"><br />
            Auteur:<input type="text" name="auteur" value="<%=request.getParameter("auteur")%>"><br />
            Année:<input type="text" name="annee" value="<%=request.getParameter("annee")%>"><br />
            <input type="submit" value="valider"><br />
        </form>
        <a href="./displaybooks">Afficher la liste des livres</a><br />
    	<a href="./displayauthors">Afficher la liste des auteurs</a><br />
    </body>
</html>

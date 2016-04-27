<!DOCTYPE html>
<html>
    <%@ page pageEncoding="UTF-8" %>
    <%@ page isErrorPage="true" %>
    <%@ page errorPage = "formulaire.jsp" %>
    <body>
        <form action="/registerbook">
            Titre:<input type="text" name="titre" value="<%=request.getParameter("titre")%>"><br />
            Auteur:<input type="text" name="auteur" value="<%=request.getParameter("auteur")%>"><br />
            Année:<input type="text" name="annee" value="<%=request.getParameter("annee")%>"><br />
            <input type="submit" value="valider"><br />
        </form>
        <a href="./displaybooks">Afficher la liste des livres</a><br />
    	<a href="./displayauthors">Afficher la liste des auteurs</a><br />
    	<%
    		String lien =  (String) request.getAttribute("session");
    		out.println(lien);
    		String message = (String) request.getAttribute("message");
            out.println(message);
    	%>
    </body>
</html>

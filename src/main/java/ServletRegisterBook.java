import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Class servlet to can register a book
 *
 * @author DIARA Pierre-Claver, LEPRETRE Rémy
 *
 */

public class ServletRegisterBook extends HttpServlet {

	@EJB
	private BeanItf bookManager;
	private SessionItf sessionManager;
	
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		response.setContentType("text/html");
		String message = "Le livre a été correctement ajouté.";
	    //catch the informations about the book
	    String author = request.getParameter( "auteur" );
	    String title = request.getParameter( "titre" );
	    try{
	    	int year = Integer.parseInt(request.getParameter( "annee" ));
	    	Book b = new Book(author, title, year);
		    bookManager.add(b);
	    } catch (Exception e) {
	    	message = "L'année doit être un nombre.";
	    }
	    
	    request.setAttribute("message", message);
	    
	    if(sessionManager.getCurrentSession()==null)
	    	request.setAttribute("session", "<a href=\"./connexion\">Connexion</a><br />");
	    else{
	    	String liens = "<a href=\"./connexion\">Deconnexion</a><br />";
	    	liens += "<a href=\"./connexion\">Deconnexion</a><br />";
	    	request.setAttribute("session", liens);
	    	
	    }
	    
	    this.getServletContext().getRequestDispatcher( "/formulaire.jsp" ).forward( request, response );
    }
	
}

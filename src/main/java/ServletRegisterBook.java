import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Class servlet for the Session
 *
 * @author DIARA Pierre-Claver, LEPRETRE Rémy
 *
 */

public class ServletRegisterBook extends HttpServlet {

	@EJB
	private BeanItf bookManager;
	
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
	    
	    //persist the book
	    
	    
	    request.setAttribute("message", message);
	    
	    this.getServletContext().getRequestDispatcher( "/formulaire.jsp" ).forward( request, response );
    }
	
}

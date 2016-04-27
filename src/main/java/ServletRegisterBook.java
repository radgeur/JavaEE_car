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
	    
	    //catch the informations about the book
	    String author = request.getParameter( "auteur" );
	    int year = Integer.parseInt(request.getParameter( "annee" ));
	    String title = request.getParameter( "titre" );
	    
	    //persist the book
	    Book b = new Book(author, title, year);
	    bookManager.add(b);
	    
	    this.getServletContext().getRequestDispatcher( "/formulaire.jsp" ).forward( request, response );
    }
	
}

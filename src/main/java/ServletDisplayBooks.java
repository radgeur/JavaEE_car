import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Class servlet to display the books list
 *
 * @author DIARA Pierre-Claver, LEPRETRE Rémy
 *
 */

public class ServletDisplayBooks extends HttpServlet{

	@EJB
	private BeanItf bookManager;
	private SessionItf sessionManager;
	
	@Override
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{   
		response.setContentType("text/html");
		
		List<Book> books = bookManager.getBooks();
	    String message = "Liste des Livres : <br />";
	   
	    
	    if(sessionManager.getCurrentSession()==null){
	    	request.setAttribute("session", "<a href=\"./connexion\">Connexion</a><br />");
	    	 for(Book b : books){
	 	    	message += b.getTitle();
	 	    	message += " de " + b.getAuthor();
	 	    	message += " écrit en " + b.getYear() + "<br />";
	 	    }
	 	    request.setAttribute("books", books);
	    }
	    else{
	    	String liens = "<a href=\"./connexion\">Deconnexion</a><br />";
	    	liens += "<a href=\"./connexion\">Deconnexion</a><br />";
	    	request.setAttribute("session", liens);
	    	 for(Book b : books){
	 	    	message += b.getTitle();
	 	    	message += " de " + b.getAuthor();
	 	    	message += " écrit en " + b.getYear() + "<br />";
	 	    }
	 	    request.setAttribute("books", books);
	    	
	    }
	    
	    this.getServletContext().getRequestDispatcher( "/booksList.jsp" ).forward( request, response );
	}
	
}

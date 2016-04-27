import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletDisplayBooks extends HttpServlet{

	@EJB
	private BeanItf bookManager;
	
	@Override
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{   
		response.setContentType("text/html");
		
		List<Book> books = bookManager.getBooks();
	    String message = "Liste des auteurs : <br />";
	    for(Book b : books){
	    	message += b.getTitle();
	    	message += " de " + b.getAuthor();
	    	message += " écrit en " + b.getYear() + "<br />";
	    }
	    request.setAttribute("books", message);
	    
	    this.getServletContext().getRequestDispatcher( "/booksList.jsp" ).forward( request, response );
	}
	
}

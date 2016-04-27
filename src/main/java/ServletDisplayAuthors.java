import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Class servlet for the Table Book
 *
 * @author DIARA Pierre-Claver, LEPRETRE Rémy
 *
 */

public class ServletDisplayAuthors extends HttpServlet {

	@EJB
	private BeanItf bookManager;
	
	@Override
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{   
		response.setContentType("text/html");
		
		List<String> authors = bookManager.getAuthors();
	    String message = "Liste des auteurs : <br />";
	    for(String s : authors){
	    	message += s + "<br />";
	    }
	    request.setAttribute("authors", message);
	    
	    this.getServletContext().getRequestDispatcher( "/authorsList.jsp" ).forward( request, response );
	}
	
}

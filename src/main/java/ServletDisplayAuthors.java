import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Class servlet to display the authors list
 *
 * @author DIARA Pierre-Claver, LEPRETRE Rémy
 *
 */

public class ServletDisplayAuthors extends HttpServlet {

	@EJB
	private BeanItf bookManager;
	private SessionItf sessionManager;
	
	@Override
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{   
		response.setContentType("text/html");
		
		List<String> authors = bookManager.getAuthors();
	    String sAuthors = "Liste des auteurs : <br />";
	    for(String s : authors){
	    	sAuthors += s + "<br />";
	    }
	    request.setAttribute("authors", sAuthors);
	    
	    if(sessionManager.getCurrentSession()==null)
	    	request.setAttribute("session", "<a href=\"./connexion\">Connexion</a><br />");
	    else{
	    	String liens = "<a href=\"./connexion\">Deconnexion</a><br />";
	    	liens += "<a href=\"./connexion\">Deconnexion</a><br />";
	    	request.setAttribute("session", liens);
	    	
	    }
	    
	    this.getServletContext().getRequestDispatcher( "/authorsList.jsp" ).forward( request, response );
	}
	
}

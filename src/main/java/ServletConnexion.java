import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Class servlet for someone to be connect
 *
 * @author DIARA Pierre-Claver, LEPRETRE Rémy
 *
 */

public class ServletConnexion extends HttpServlet{
	
	@EJB
	private SessionItf sessionManager;
	
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{   
		response.setContentType("text/html");
		
		sessionManager.initSession();
		
		this.getServletContext().getRequestDispatcher( "/connexion.jsp" ).forward( request, response );
	}
	
}

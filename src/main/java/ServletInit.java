import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Class servlet to init the books DB
 *
 * @author DIARA Pierre-Claver, LEPRETRE Rémy
 *
 */

public class ServletInit extends HttpServlet {

	@EJB
	private BeanItf bookManager;
	private SessionItf sessionManager;
	
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{   
		response.setContentType("text/html");
		
		bookManager.resetDB();
		
		bookManager.init();
		
		if(sessionManager.getCurrentSession()==null)
	    	request.setAttribute("session", "<a href=\"./connexion\">Connexion</a><br />");
	    else{
	    	String liens = "<a href=\"./connexion\">Deconnexion</a><br />";
	    	liens += "<a href=\"./connexion\">Deconnexion</a><br />";
	    	request.setAttribute("session", liens);
	    	
	    }
		
		this.getServletContext().getRequestDispatcher( "/init.jsp" ).forward( request, response );
	}
}

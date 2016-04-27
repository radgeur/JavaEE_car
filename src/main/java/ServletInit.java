import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletInit extends HttpServlet {

	@EJB
	private BeanItf bookManager;
	
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{   
		response.setContentType("text/html");
		
		bookManager.resetDB();
		
		bookManager.init();
		
		this.getServletContext().getRequestDispatcher( "/init.jsp" ).forward( request, response );
	}
}

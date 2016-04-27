import java.util.List;

import javax.ejb.Local;
import javax.servlet.http.HttpSession;

/**
 * interface to can instantiate a SessionBean
 *
 * @author DIARA Pierre-Claver, LEPRETRE Rémy
 *
 */

@Local
public interface SessionItf {

	public HttpSession getCurrentSession();
	
	public void invalidateSession();
	
	public List<Book> getListBooksSession();
	
	public void addOrder(Order o);
	
	public void initSession();
	
	public void addBookToOrder(Book b);
	
	public void deleteBookToOrder(Book b);
	
}

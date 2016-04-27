import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Class for the method on the table order
 *
 * @author DIARA Pierre-Claver, LEPRETRE Rémy
 *
 */

@Stateless
public class MaSession implements SessionItf{

	@PersistenceContext
	private EntityManager em;
	private HttpSession session = null;
	private HttpServletRequest request;
	
	@Override
	public void initSession(){
		session = request.getSession();
	}
	
	@Override
	public HttpSession getCurrentSession() {
		return session;
	}

	
	@Override
	public void invalidateSession() {
		session.invalidate();
	}

	@Override
	public List<Book> getListBooksSession() {
		return null;
	}

	@Override
	public void addOrder(Order o) {
		em.persist(o);
	}

	@Override
	public void addBookToOrder(Book b){
		List<Book> books = (List<Book>) session.getAttribute("books");
		books.add(b);
		session.setAttribute("books", books);
	}
	
	@Override
	public void deleteBookToOrder(Book b){
		List<Book> books = (List<Book>) session.getAttribute("books");
		books.remove(b);
		session.setAttribute("books", books);
	}

}

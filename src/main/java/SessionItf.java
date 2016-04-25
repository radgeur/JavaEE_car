import java.util.List;

import javax.ejb.Local;

/**
 * interface to can instantiate a Session
 *
 * @author DIARA Pierre-Claver, LEPRETRE Rémy
 *
 */

@Local
public interface SessionItf {
	public void add(Book b);
	
	public List<Book> getBooks();
	
}

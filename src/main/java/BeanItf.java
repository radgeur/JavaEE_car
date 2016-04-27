import java.util.List;

import javax.ejb.Local;

/**
 * interface to can instantiate a Bean
 *
 * @author DIARA Pierre-Claver, LEPRETRE Rémy
 *
 */

@Local
public interface BeanItf {
	
	public void init();
	
	/** Add a book in the DB
	 * @param b book to add
	 */
	public void add(Book b);
	
	/** return the list of the author in the DB
	 * @return list of authors
	 */
	public List<String> getAuthors();
	
	
	/** return the list of all the books in the DB
	 * @return list of books
	 */
	public List<Book> getBooks();
	
	/** reset all the db and remove all the books */
	public void resetDB();
	
}

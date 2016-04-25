import java.util.List;

import javax.ejb.Stateless;

/**
 * Class for the Session
 *
 * @author DIARA Pierre-Claver, LEPRETRE Rémy
 *
 */

@Stateless()
public class SessionBean implements SessionItf{

	@Override
	public void add(Book b) {
				
	}

	@Override
	public List<Book> getBooks() {
		return null;
	}
	
}

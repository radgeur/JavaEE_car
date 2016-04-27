import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Class for the Session
 *
 * @author DIARA Pierre-Claver, LEPRETRE Rémy
 *
 */

@Stateless
public class BookBean implements BeanItf{
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
    public void init() { 
        Book b1 = new Book("Honore de Balzac","Le Pere Goriot", 1792); 
        Book b2 = new Book("Honore de Balzac","Les Chouans", 1685); 
        Book b3 = new Book("Victor Hugo","Les Miserables", 1891); 
        em.persist(b1); 
        em.persist(b2); 
        em.persist(b3); 
}

	@Override
	public void add(Book b) {
		em.persist(b);
	}

	@Override
	public List<String> getAuthors() {
		Query q = em.createQuery("SELECT DISTINCT b.author from Book b");
		return q.getResultList();
	}
	
	@Override
	public List<Book> getBooks(){
		Query q = em.createQuery("SELECT b from Book b");
		return q.getResultList();
	}
	
	@Override
	public void resetDB(){
		List<Book> books = getBooks();
		for(Book b: books){
			em.remove(b);
		}
	}
	
}

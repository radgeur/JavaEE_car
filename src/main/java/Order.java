import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Class for the table Order
 *
 * @author DIARA Pierre-Claver, LEPRETRE Rémy
 *
 */

@Entity
public class Order {
	//ATTRIBUTES
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private Book book;
	
	//METHODS
	/** Constructor */
	public Order(){}
	
	
	public Order(Book books) {
		this.book = books;
	}
	
	public long getId() { return this.id; }
    public void setId(long id) { this.id = id; }
    public Book getOrder(){ return this.book;}
    public void setOrder(Book books) {this.book = books;}
}

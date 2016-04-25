import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Class for the table Book
 *
 * @author DIARA Pierre-Claver, LEPRETRE Rémy
 *
 */

@Entity
public class Book {
    //ATTRIBUTES
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String author;
    private String title;
    private int year;

    //METHODS
    /** Constructor */
    public Book() {}

    /** Constructor with args
     *@param author of the book
     *@param title of the book
     */
    public Book(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    //Getters and setters
    public long getId() { return this.id; }
    public void setId(long id) { this.id = id; }
    public String getAuthor() { return this.author; }
    public void setAuthor(String author) { this.author = author; }
    public String getTitle() { return this.title; }
    public void setTitle(String title) { this.title = title; }
    public int getYear() { return this.year; }
    public void setYear(int year) { this.year = year; }
}

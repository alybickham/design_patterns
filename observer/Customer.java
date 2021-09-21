package observer;
import java.util.*;

/**
 * A Customer object
 * @author Ashley Bickham
 */
public class Customer implements Observer {
    
    private Subject subject;
    private String firstName;
    private String lastName;
    private ArrayList<Book> wishList;

    /**
     * Constructs a Customer object and registers it as an Observer of the Subject
     * @param subject The Subject to be set and allows the Customer to observe the Subject
     * @param firstName The Customer's first name
     * @param lastName The Customer's last name
     */
    public Customer(Subject subject, String firstName, String lastName) {
        this.subject = subject;
        this.firstName = firstName;
        this.lastName = lastName;
        this.wishList = new ArrayList<Book>();
        this.subject.registerObserver(this);
    }

    /**
     * Updates the Book by adding it to the Customer's Wishlist
     * @param book The Book to be added
     */
    public void update(Book book) {
        wishList.add(book);
    }

    /**
     * Iterates through the wishlist and prints each Book
     */
    public void display(){
        System.out.println("Wish List:");
        for (Book wishListBook : wishList) {
            System.out.println(wishListBook);
        }
    }


}

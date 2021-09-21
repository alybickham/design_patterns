package observer;
import java.util.*;

/**
 * A Store object
 * @author Ashley Bickham
 */
public class Store implements Observer{
    
    private Subject subject;
    private String title;
    private Queue<Book> bestSellers;

    /**
     * Constructs a Store object and registers it as an Observer of the Subject
     * @param subject The Subject to be set and allows the Store to observe the Subject
     */
    public Store(Subject subject) {
        this.subject = subject;
        bestSellers = new LinkedList<Book>();
        this.subject.registerObserver(this);
    }

    /**
     * Adds the Book to the bestSellers queue, but removes the first Book in the queue if there are 5 Books already in the queue
     * @param book The Book to be added to the bestSellers queue 
     */
    public void update(Book book) {
        if (bestSellers.size() >= 5) {
            bestSellers.remove();
            bestSellers.add(book);
        }
        else {
            bestSellers.add(book);
        }

    }

    /**
     * Iterates through the bestSellers queue and prints each Book
     */
    public void display() {
        System.out.println("Top 5 Best Sellers:");
        for ( Book bestSellerBook : bestSellers) {
            System.out.println(bestSellerBook);
        }
        System.out.println();
    }

}

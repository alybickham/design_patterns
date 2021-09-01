package observer;
import java.util.*;

public class Store implements Observer{
    
    private Subject subject;
    private String title;
    private Queue<Book> bestSellers;

    public Store(Subject subject, String title) {
        this.subject = subject;
        this.title = title;
        this.bestSellers = new Queue<Book>();
    }

    public void update(Book book) {
        // to do
    }

    public void display() {
        // to do
    }

}

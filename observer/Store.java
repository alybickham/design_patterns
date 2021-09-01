package observer;
import java.util.*;

public class Store implements Observer{
    
    private Subject subject;
    private String title;
    private Queue<Book> bestSellers;

    public Store(Subject subject, String title) {
        this.subject = subject;
        this.title = title;
        this.bestSellers = new Queue<>();
    }

    public void update(Book book) {
        int booksInBestSellers = 0;
        if (booksInBestSellers > 5) {
            bestSellers.add(book);
        }
        bestSellers.remove();
        bestSellers.add(book);
    }

    public void display() {
        for ( Book bestSellerBook : bestSellers)
            System.out.println(bestSellerBook);
    }

}

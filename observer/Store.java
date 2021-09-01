package observer;
import java.util.*;

public class Store implements Observer{
    
    private Subject subject;
    private String title;
    private Queue <Book> bestSellers;

    public Store(Subject subject, String title) {
        this.subject = subject;
        this.title = title;
        bestSellers = new Queue<Book>();
    }

    public void update(Book book) {
        int booksInBestSellers = 0;
        if (booksInBestSellers > 5) {
            bestSellers.remove();
            bestSellers.add(book);
        }
        else {bestSellers.add(book);}
    }

    public void display() {
        for ( Book bestSellerBook : bestSellers)
            System.out.println(bestSellerBook);
    }

}

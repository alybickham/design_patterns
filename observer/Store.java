package observer;
import java.util.*;

public class Store implements Observer{
    
    private Subject subject;
    private String title;
    private Queue<Book> bestSellers;

    public Store(Subject subject) {
        this.subject = subject;
        bestSellers = new LinkedList<Book>();
        subject.registerObserver(this);
    }

    public void update(Book book) {
        if (bestSellers.size() >= 5) {
            bestSellers.remove();
            bestSellers.add(book);
        }
        else {
            bestSellers.add(book);
        }

    }

    public void display() {
        System.out.println("Top 5 Best Sellers:");
        for ( Book bestSellerBook : bestSellers) {
            System.out.println(bestSellerBook);
        }
        System.out.println();
    }

}

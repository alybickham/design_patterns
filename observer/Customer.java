package observer;
import java.util.*;

public class Customer implements Observer {
    
    private Subject subject;
    private String firstName;
    private String lastName;
    private ArrayList<Book> wishList;

    public Customer(Subject subject, String firstName, String lastName) {
        this.subject = subject;
        this.firstName = firstName;
        this.lastName = lastName;
        this.wishList = new ArrayList<Book>();
        this.subject.registerObserver(this);
    }

    public void update(Book book) {
        wishList.add(book);
    }

    public void display(){
        System.out.println("Wish List:");
        for (Book wishListBook : wishList) {
            System.out.println(wishListBook);
        }
    }


}

package observer;
import java.util.*;

/**
 * Contains the list of BestSeller books within an ArrayList, as well as an ArrayList of the Observers
 * @author Ashley Bickham
 */
public class BestSellers implements Subject {
    private ArrayList<Observer> observers;
    private ArrayList<Book> bestSellers;

    /**
    * Constructs a BestSeller object and creates an empty ArrayList for each respective instance variable
    */
    public BestSellers() {
        this.observers = new ArrayList<>();
        ArrayList<Book> bestSellers = new ArrayList<>();
        this.bestSellers = bestSellers;
    }

    /**
     * Registers the Observer by adding it to the observers ArrayList
     * @param observer The Observer to be added
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
    * Removes the Observer from the observers ArrayList
    * @param observer The Observer to be removed
    */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Notifies the Observers by iterating through the observers ArrayList and updating each
     * @param book
     */
    public void notifyObservers(Book book) {
        for (Observer i : observers) {
            i.update(book);
        }
    }
    
    /**
    * Adds the Book to the bestSellers ArrayList and notifies the Observers on the Book
    * @param book The Book to be added and that will be notified about
    */
    public void addBook(Book book) {
        bestSellers.add(book);
        notifyObservers(book);
    }
    
}

package observer;

/**
 * An interface that allows for multiple types of Observers
 * @author Ashley Bickham
 */
public interface Observer {

    /**
     * Updates the Book by adding it to the Customer's wishlist
     * @param book The Book to be added
     */
    public void update(Book book);

    /**
     * Iterates through the booklist and prints each Book
     */
    public void display();
}

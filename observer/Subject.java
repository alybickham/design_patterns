package observer;

/**
 * An interface that allows for multiple Subjects to be observed
 */
public interface Subject {
   
   /**
    * Registers the Observer to the Subject
    * @param observer The Observer to be registered
    */
    public void registerObserver(Observer observer);

    /**
     * Removes the Observer's registration to the Subject
     * @param observer The Observer to be removed
     */
    public void removeObserver(Observer observer);

    /**
     * Notifies the Observers, that are Registered to the Subject, of the book
     * @param book The Book that is notified about
     */
    public void notifyObservers(Book book);
}

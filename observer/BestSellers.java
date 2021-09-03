package observer;

import java.util.*;

public class BestSellers implements Subject {
    
    private ArrayList<Observer> observers;
    private ArrayList<Book> bestSellers;

    public BestSellers() {
        this.observers = new ArrayList<>();
        ArrayList<Book> bestSellers = new ArrayList<>();
        this.bestSellers = bestSellers;
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(Book book) {
        for (Observer i : observers) {
            i.update(book);
        }
    }

    public void addBook(Book book) {
        bestSellers.add(book);
        notifyObservers(book);
    }
    
}

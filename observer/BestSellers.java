package observer;

import java.util.*;

public class BestSellers implements Subject {
    
    private ArrayList<Observer> observers;
    private ArrayList<Book> bestSellers;

    public BestSellers() {
        this.observers = new ArrayList<Observer>();
        this.bestSellers = new ArrayList<Book>();
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
            System.out.println(book);
        }
    }

    public void addBook(Book book) {
        
        bestSellers.add(book);
        notifyObservers(book);
    }
    
}

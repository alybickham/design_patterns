import java.util.Iterator;

/**
 * Allows for iteration of a given Flight array
 * @author Ashley Bickham
 */
public class FlightIterator implements Iterator {
    private Flight[] flights;
    private int position = 0;

    /**
     * Constructs the Iterator
     * @param flights The Flight array to be iterated though
     */
    public FlightIterator(Flight[] flights) {
        this.flights = flights;
    }

    /**
     * Checks the Flight array for a consequent element
     * @return A boolean representaion on whether the Flight array has a consequent element (True) or not (False)
     */
    public boolean hasNext(){
        return (flights[position] != null && position < flights.length );
    }

    /**
     * Provides the next Flight in the Flight array
     * @return The next Flight in the Flight array
     */
    public Flight next(){
        if (hasNext()) {
            Flight flight = flights[position++];
            return flight;
        }
        return null;
    }
}

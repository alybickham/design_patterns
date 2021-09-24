import java.util.Iterator;

public class FlightIterator implements Iterator {
    private Flight[] flights;
    private int position = 0;

    public FlightIterator(Flight[] flights) {
        this.flights = flights;
    }

    public boolean hasNext(){
        return ( position < flights.length && flights[position] != null);
    }

    public Flight next(){
        Flight flight = flights[position++];
        return flight;
    }
}

/**
 * An airline object containing a title, array of Flights, and a size
 * @author Ashley Bickham
 */
public class Airline {
 private String title;
 private Flight[] flights;
 private int size = 0;

 /**
  * Constructs the Airline, setting the title and creating an array of Flights of size 2
  * @param title The title of the Airline to be set
  */
 public Airline(String title) {
     this.title = title;
     flights = new Flight[2];

 }

 /**
  * Adds a flight to the array of Flights and expands the size of the array where necessary
  * @param flightNum A string representation of the flight number of the Flight to be added
  * @param from A string representation of the initial location of the flight to be added
  * @param to A string representation of the destination of the flight to be added
  * @param duration An integer representation in minutes of the durion of the flight to be added 
  * @param transfers An integer representation of the number of transfers of the flight to be added
  */
 public void addFlight(String flightNum, String from, String to, int duration, int transfers) {
    Flight newFlight = new Flight(flightNum, from, to, duration, transfers);
    if (size >= flights.length) {
        growArray(flights);
    }
    flights[size++] = newFlight;

 }

 /**
  * Provides a String representation of the title of the Airline
  * @return A String representation of the title of the Airline
  */
 public String getTitle(){
     return title;
 }

 /**
  * Copies the information from the given Flight array into an expanded array
  * @param flights The Flight array to be copied and expanded
  * @return The expanded array with the copied information
  */
 private Flight[] growArray (Flight[] flights) {
     final int SIZEMULTIPLIER = 2;
     Flight[] temp = new Flight[flights.length * SIZEMULTIPLIER];
     FlightIterator iterator = createIterator();
    for (int i = 0; i < flights.length; i++){
        if (iterator.hasNext()) {
            temp[i] = iterator.next();
        }
    }
    this.flights = temp;
    return this.flights;
 }

 /**
  * Creates an Iterator that allows iteration of the Flight array
  * @return An Iterator for the Flight array
  */
 public FlightIterator createIterator(){
     return new FlightIterator(flights);
 }
}

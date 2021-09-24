
public class Airline {
 private String title;
 private Flight[] flights;
 private int size = 0;

 public Airline(String title) {
     this.title = title;
     flights = new Flight[2];

 }

 public void addFlight(String flightNum, String from, String to, int duration, int transfers) {
    Flight newFlight = new Flight(flightNum, from, to, duration, transfers);
    if (size >= flights.length) {
        System.out.println(size);
        growArray(flights);
    }
    flights[size++] = newFlight;

 }

 public String getTitle(){
     return title;
 }

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

 public FlightIterator createIterator(){
     return new FlightIterator(flights);
 }
}

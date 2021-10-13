package iterator;

/**
 * A Flight object, containing all Flight information
 * @author Ashley Bickham
 */

public class Flight {
    
    String flightNum;
    String from;
    String to;
    int duration;
    int transfers;

    /**
     * Constructs a Flight
     * @param flightNum A string representation of the flight number of the Flight to be made
     * @param from A string representation of the initial location of the flight to be made
     * @param to A string representation of the destination of the flight to be made
     * @param duration An integer representation in minutes of the duration of the flight to be made 
     * @param transfers An integer representation of the number of transfers of the flight to be made
     */
    public Flight(String flightNum, String from, String to, int duration, int transfers){
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.duration = duration;
        this.transfers = transfers;
    }
    
    /**
     * Provides the initial location of the flight
     * @return A string representation of the initial location of the flight
     */
    public String getFrom(){
        return from;
    }

    /**
     * Provides the destination of the flight
     * @return A string representation of the destination of the flight
     */
    public String getTo(){
        return to;
    }

    /**
     * Provides the duration of the flight
     * @return An integer representation in minutes of the duration of the flight 
     */
    public int getDuration(){
        return duration;
    }

    /**
     * Provides the number of transfers of the flight
     * @return An integer representation of the number of transfers of the flight 
     */
    public int getNumTransfers(){
        return transfers;
    }

    /**
     * Consolidates all Flight information into a single string
     * @return A String representation of the Flight information
     */
    public String toString(){
        final int HOURINMINS = 60;
        String transferType;
        if (getNumTransfers() == 0) {
            transferType = "Direct Flight\n";
        }
        else if (getNumTransfers() == 1) {
            transferType = getNumTransfers() + " Transfer\n";
        }
        else {
            transferType = getNumTransfers() + " Transfers\n";
        }
        return "Flight Number: " + flightNum +
                "\nFrom: " + from +
                "\nTo: " + to +
                "\nDuration: " + (duration / HOURINMINS) + " hour(s) " + (duration % HOURINMINS) + " minute(s)\n" +
                transferType;
    }
}

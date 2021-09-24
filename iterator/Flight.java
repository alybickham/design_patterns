public class Flight {
    
    String flightNum;
    String from;
    String to;
    int duration;
    int transfers;

    public Flight(String flightNum, String from, String to, int duration, int transfers){
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.duration = duration;
        this.transfers = transfers;
    }

    public String getFrom(){
        return from;
    }

    public String getTo(){
        return to;
    }

    public int getDuration(){
        return duration;
    }

    public int getNumTransfers(){
        return transfers;
    }

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
        return "FlightNumber: " + flightNum + 
                "\nFrom: " + from + 
                "\nTo: " + to +
                "\nDuration: " + (duration / HOURINMINS) + " hours " + (duration % HOURINMINS) + " minutes\n" +
                transferType;
    }
}

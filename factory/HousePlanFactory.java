package factory;

/**
 * Allows for creation of HousePlan via String input, simplifies construction of any HousePlan by only requiring a String input
 * @author Ashley Bickham
 */
public class HousePlanFactory {
    /**
     * Creates a HousePlan based off the String input
     * @param typel A String representtaion of the HousePlan that will be constructed
     * @return A variation of a HousePlan
     */
    public static HousePlan createHousePlan(String typel){
        if (typel.equalsIgnoreCase("log cabin")) {
            HousePlan newLogCabin = new LogCabinPlan();
            return newLogCabin;
        }
        else if (typel.equalsIgnoreCase("tiny home")){
            HousePlan newTinyHome = new TinyHomePlan();
            return newTinyHome;
        }
        else {
            HousePlan newContemporaryHouse = new ContemporaryPlan();
            return newContemporaryHouse;
        }
    }
}

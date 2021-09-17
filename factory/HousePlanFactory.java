package factory;

public class HousePlanFactory {
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

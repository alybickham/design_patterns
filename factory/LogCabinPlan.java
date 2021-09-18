package factory;

/**
 * One variation of HousePlan: a Log Cabin
 * @author Ashley Bickham
 */
public class LogCabinPlan extends HousePlan{
    /**
     * Constructs a HousePlan using predetermined values for a Log Cabin
     */
    public LogCabinPlan(){
        super(2, 10, 1800);
        setMaterials();
        setFeatures();
    }

    /**
     * Sets materials to predetermined values for a Log Cabin 
     */
    protected void setMaterials(){
        super.materials.add("Log Siding");
        super.materials.add("Board and Batten Siding");
        super.materials.add("White Pine");
    }

    /**
     * Sets features to predetermined values for a Contemporary House
     */
    protected void setFeatures(){
        features.add("Timbered Roof");
        super.features.add("High Insulation");
        super.features.add("Rustic Effect");
    }

     /**
     * Provides a String representation of the particular HousePlan information that is viewable to the user
     */
    public String toString(){
        return ("Log Cabin\n"+ super.toString());
    }

}

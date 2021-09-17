package factory;
/**
 * One variation of HousePlan: a Contemporary House
 * @author Ashley Bickham
 */
public class ContemporaryPlan extends HousePlan{
    /**
     * constructs a HousePlan using provided values for a Contemporary House
     */
    public ContemporaryPlan(){
        super(5, 40, 3000);
        setMaterials();
        setFeatures();
    }

    /**
     * Sets materials to predetermined values for a Contemporary House 
     */
    protected void setMaterials(){
        super.materials.add("Ceramics");
        super.materials.add("High-Strength Alloys");
        super.materials.add("Composites");
    }

    /**
     * Sets features to predetermined values for a Contemporary House
     */
    protected void setFeatures(){
        super.features.add("Oversized Windows");
        super.features.add("Unconventional Roofs");
        super.features.add("Minimalism");
        super.features.add("Open Floor Plan");
    }

    /**
     * Provides a String representatioon of the particular HousePlan information that is viewable to the user
     */
    public String toString(){
        return ("Contemporary Home\n" + super.toString());
    }

}

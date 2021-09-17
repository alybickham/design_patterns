package factory;

/**
 * One variation of HousePlan: a Tiny Home
 * @author Ashley Bickham
 */
public class TinyHomePlan extends HousePlan {
    /**
     * constructs a HousePlan using provided values for a Tiny Home
     */
    public TinyHomePlan(){
        super(1, 5, 200);
        setMaterials();
        setFeatures();
    }

    /**
     * Sets materials to predetermined values for a Tiny Home
     */
    protected void setMaterials(){
        super.materials.add("Lumber");
        super.materials.add("Insulation");
        super.materials.add("Metal Roofing");
        super.materials.add("Hardware");
    }

    /**
     * Sets features to predetermined values for a Tiny Home
     */
    protected void setFeatures(){
        super.features.add("Natural Light");
        super.features.add("Creative Storage");
        super.features.add("Multipurpose areas");
        super.features.add("Multi-use applications");
    }

     /**
     * Provides a String representatioon of the particular HousePlan information that is viewable to the user
     */
    public String toString(){
        return ("Tiny House\n" + super.toString());
    }

}

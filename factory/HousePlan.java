package factory;
import java.util.ArrayList;

/**
 * Contains all information in a HousePlan
 * @author Ashley Bickham
 */
public abstract class HousePlan extends HousePlanFactory{
    protected ArrayList<String> materials;
    protected ArrayList<String> features;
    private int numRooms;
    private int numWindows;
    private int squareFeet;

    /**
     * Constructs a HousePlan using the inputs
     * @param numRooms An integer representation of the number of rooms for the HousePlan
     * @param numWindows An integer representation of the number of windows for the HousePlan
     * @param squareFeet An integer representation of size of the HousePlan in square feet
     */
    public HousePlan(int numRooms, int numWindows, int squareFeet){
        this.numRooms = numRooms;
        this.numWindows = numWindows;
        this.squareFeet = squareFeet;
        this.materials = new ArrayList<String>();
        this.features = new ArrayList<String>();
    }

    /**
     * Sets the materials for the HousePlan
     */
    protected abstract void setMaterials();

    /**
     * Sets the features for the HousePlan
     */
    protected abstract void setFeatures();

    /**
     * Provides the materials of the HousePlan
     * @return The String ArrayList of the materials
     */
    public ArrayList<String> getMaterials(){
        return materials;
    }

    /**
     * Provides the features of the HousePlan
     * @return The String ArrayList of the features
     */
    public ArrayList<String> getFeatures(){
        return features;
    }

    /**
     * Provides the number of rooms in the HousePlan
     * @return An integer representation of the number of rooms in the HousePlan
     */
    public int getNumRooms(){
        return numRooms;
    }

    /**
     * Provides the number of windows in the Houseplan
     * @return An integer representation of the number of windows in the HousePlan
     */
    public int getNumWindows(){
        return numWindows;
    }

    /**
     * Provies the size of the HousePlan in square feet
     * @return an integer representation of the size of the HousePlan in square feet
     */
    public int getSquareFeet(){
        return squareFeet;        
    }

   /**
     * Provides a String representation of the HousePlan information that is viewable to the user
     */
    public String toString(){
        String materialsString = "";

        String featuresString = "";

        for (int i = 0; i < materials.size(); i++){
            materialsString = materialsString + "- " + materials.get(i) + "\n";
        }

        for (int i = 0; i < features.size(); i++){
            featuresString = featuresString +  "- " + features.get(i) + "\n";
        }
        
        return ("Square Feet: " + squareFeet + "\n" +
        "Room(s): " + numRooms + "\n" +
        "Windows: " + numWindows + "\n\n" +
        "Materials:\n" + materialsString  + "\n" +
        "Features:\n" + featuresString  + "\n");
    }
}

package factory;
import java.util.ArrayList;

public abstract class HousePlan extends HousePlanFactory{
    protected ArrayList<String> materials;
    protected ArrayList<String> features;
    private int numRooms;
    private int numWindows;
    private int squareFeet;

    public HousePlan(int numRooms, int numWindows, int squareFeet){
        this.numRooms = numRooms;
        this.numWindows = numWindows;
        this.squareFeet = squareFeet;
        this.materials = new ArrayList<String>();
        this.features = new ArrayList<String>();
    }

    protected abstract void setMaterials();

    protected abstract void setFeatures();

    public ArrayList<String> getMaterials(){
        return materials;
    }

    public ArrayList<String> getFeatures(){
        return features;
    }

    public int getNumRooms(){
        return numRooms;
    }

    public int getNumWindows(){
        return numWindows;
    }

    public int getSquareFeet(){
        return squareFeet;        
    }

    public String toString(){
        String materialsString = "";
        String featuresString = "";
        for (int i = 0; i < materials.size(); i++){
            materialsString += "- " + materials.get(i) + "\n";
        }
        for (int i = 0; i < materials.size(); i++){
            materialsString += "- " + materials.get(i) + "\n";
        }

        return "Square Feet: " + squareFeet + "\n" +
                "Room(s): " + numRooms + "\n" +
                "Windows: " + numWindows + "\n\n" +
                "Materials: " + materialsString  + "\n\n" +
                "Features: " + featuresString  + "\n\n";
    }
}

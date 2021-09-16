package factory;
import java.util.ArrayList;

public abstract class HousePlan extends HousePlanFactory{
    protected ArrayList<String> materials;
    protected ArrayList<String> features;
    private int numRooms;
    private int numWindows;
    private int squareFeet;

    public HousePlan(int numRooms, int numWindows, int squareFeet){
        // to do
    }

    protected void setMaterials(){
        //to do
    }

    protected void setFeatures(){
        //to do
    }

    public ArrayList<String> getMaterials(){
        //to do
    }

    public ArrayList<String> getFeatures(){
        //to do
    }

    public int getNumRooms(){
        // to do
    }

    public int getNumWindows(
        // to do
    )

    public int getSquareFeet(){
        // to do        
    }

    public String toString(){
        // to do
    }
}

package decorator;
import java.util.*;

/**
 * A Character object that allows multiple variations of Character
 * @author Ashley Bickham
 */
public abstract class Character{
    protected ArrayList<String> sections;

    /**
     * Constructs the Character and creates an empty ArrayList of Strings
     */
    public Character(){
        this.sections = new ArrayList<String>();
    }

    /**
     * Draws the Character by iterating through the ArrayList sections and printing each value
     */
    public void draw(){
        for (String line : sections){
            System.out.println(line);
        }
    }

}
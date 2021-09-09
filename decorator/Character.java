package decorator;
import java.util.*;

public abstract class Character{
    protected ArrayList<String> sections;

    public Character(){
        this.sections = new ArrayList<String>();
    }

    public void draw(){
        for (String line : sections){
            System.out.println(line);
        }
    }

}
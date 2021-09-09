package decorator;

/**
 * Allows for a hat to be added to a Character
 * @author Ashley Bickham
 */
public class Hat extends CharacterDecorator{
    
    /**
     * Creates a character and adds a hat
     * @param character The character base used to create a Character
     */
    public Hat(Character character){
        super(character);     
        customize();
    }

    /**
     * Allows for a hat to be added by changing the string value at a specified index of the ArrayList sections
     */
    public void customize(){
        sections.set(0,"    ____");
        sections.set(1," __|____|____");
    }

}
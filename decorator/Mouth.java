package decorator;

/**
 * Allows for a mouth to be added to a Character
 * @author Ashley Bickham
 */
public class Mouth extends CharacterDecorator{
    
    /**
     * Creates a character and adds a mouth
     * @param character The character base used to create a Character
     */
    public Mouth(Character character){
        super(character);
        customize();
    }

    /**
     * Allows for a mouth to be added by changing the string value at a specified index of the ArrayList sections
     */
    public void customize(){
        sections.set(5,"  \\ ---- /");
    }

}
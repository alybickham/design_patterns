package decorator;

/**
 * Allows for a mouth to be added to a Character
 * @author Ashley Bickham
 */
public class Nose extends CharacterDecorator{
    
     /**
     * Creates a character and adds a nose
     * @param character The character base used to create a Character
     */
    public Nose(Character character){
        super(character);
        customize();
    }

    /**
     * Allows for a nose to be added by changing the string value at a specified index of the ArrayList sections
     */
    public void customize(){
        sections.set(4," |   >    |");
    }

}
package decorator;

/**
 * Allows for eyes to be added to a Character
 * @author Ashley Bickham
 */
public class Eyes extends CharacterDecorator{
    
    /**
     * Creates a Character and adds eyes
     * @param character The character base used to create a Character
     */
    public Eyes(Character character){
        super(character);
        customize();
    }

    /**
     * Allows for eyes to be added by changing the string value at a specified index of the ArrayList sections
     */
    public void customize(){
        sections.set(3, " |  o  o  |");
    }

}
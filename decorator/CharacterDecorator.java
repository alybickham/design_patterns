package decorator;

/**
 * A wrapper class for Character, allowing for features to be added on a Character
 * @author Ashley Bickham
 */
public abstract class CharacterDecorator extends Character{
    protected Character character;

    /**
     * Creates a character that allows features to be added
     * @param character The base Character before features are added to be used
     */
    public CharacterDecorator(Character character){
        super();
        this.character = character;
        for (String line : character.sections){
            sections.add(line);
        }
    }

    /**
     * Allows for specific features to be added to a Character
     */
    public void customize(){
    }
}
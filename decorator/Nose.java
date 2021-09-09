package decorator;

public class Nose extends CharacterDecorator{
    
    public Nose(Character character){
        super(character);
        // this.character = character;
        customize();
    }

    public void customize(){
        sections.set(4," |   >    |");
    }

}
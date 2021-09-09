package decorator;

public class Mouth extends CharacterDecorator{
    
    public Mouth(Character character){
        super(character);
        // this.character = character;
        customize();
    }

    public void customize(){
        sections.set(5,"  \\ ---- /");
    }

}
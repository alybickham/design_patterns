package decorator;

public class Hat extends CharacterDecorator{
    
    public Hat(Character character){
        super(character);     
        // this.character = character; 
        customize();
    }

    public void customize(){
        sections.set(0,"    ____");
        sections.set(1," __|____|____");
    }

}
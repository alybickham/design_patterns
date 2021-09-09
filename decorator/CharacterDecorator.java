package decorator;

public abstract class CharacterDecorator extends Character{
    protected Character character;

    public CharacterDecorator(Character character){
        super();
        this.character = character;
        for (int i = 0; i<character.sections.size(); i++){
            this.character.sections.set(i,character.sections.get(i));
        }
    }

    public void customize(){
    }
}
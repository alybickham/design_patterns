package decorator;

public abstract class CharacterDecorator extends Character{
    protected Character character;

    public CharacterDecorator(Character character){
        super();
        this.character = character;
        for (String line : character.sections){
            sections.add(line);
        }
    }

    public void customize(){
    }
}
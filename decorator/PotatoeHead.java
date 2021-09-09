package decorator;

/**
 * One of the base variations of a Character
 * @author Ashley Bickham
 */
public class PotatoeHead extends Character{
    
    /**
     * Creates a PotatoeHead Character by adding specific string values to the ArrayList sections line by line
     */
    public PotatoeHead(){
        sections.add("");
        sections.add("  ____");
        sections.add("  /      \\");
        sections.add(" |        |");
        sections.add(" |        |");
        sections.add("  \\      /");
        sections.add("   \\____/");
    }

}

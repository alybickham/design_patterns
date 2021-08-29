import java.util.*;

/**
 *A program containing the list of guests 
 *  @author Ashley Bickham
 * 
 */
public class GuestList {
    /**
     * The name of the GuestList, allowing for reference to a specific GuestList.
     */
    private String title;
    /**
     * Contains an ArrayList of the people on the GuestList
     */
    private ArrayList<String> people;
    /**
     * Indicates the searchBehavior to be used
     */
    private SearchBehavior searchBehavior;

    /**
     * Creates a GuestList with the indicated title
     * @param title The name of the GuestList
     */
    public GuestList(String title){
        this.title = title;
        LinearSearch lSearch = new LinearSearch();
        this.searchBehavior = lSearch;
        ArrayList<String> people = new ArrayList<>();
        this.people = people;
    }

    /**
     * Adds the indicated person to the GuestList, given they are not already on the list.
     * @param person The person to be added to the GuestList
     * @return A boolean value indicating if the person was sucessfully added to the GuestList(true) or not(false)
     */
    public boolean add(String person){
        if (searchBehavior.contains(people, person)){
            return false;
        }

        people.add(person);
        return true;
    }

    /**
     * Removes the indicated person to the Guestlist, given they are on the list.
     * @param person The person to be removed from the GuestList
     * @return A boolean value indicating if the person was removed from the list(true) or not(false)
     */
    public boolean remove(String person){
        if (searchBehavior.contains(people, person)){
            people.remove(person);
            return true;
        }

        return false;
    }

    /**
     * Retreives of the title Guestlist
     * @return A string representation of the title for this GuestList
     */
    public String getTitle(){
        return this.title;
    }    

    /**
     * Sets the SearchBehavior, indicating which search prodedure to implement
     * @param searchBehavior The SearchBehavior to be set for this GuestList
     */
    public void setSearchBehavior(SearchBehavior searchBehavior){
        this.searchBehavior = searchBehavior;
    }

    /**
     * Allows for retrieval of the ArrayList from this GuestList
     * @return The ArrayList from this Guestlist
     */
    public ArrayList<String> getList(){
        return this.people;
    }
}
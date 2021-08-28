import java.util.*;
//Written by Ashley Bickham

public class GuestList {
    private String title;
    private ArrayList<String> people;
    private SearchBehavior searchBehavior;

    public GuestList(String title){
        this.title = title;
        LinearSearch lSearch = new LinearSearch();
        this.searchBehavior = lSearch;
        // ArrayList<String> this.people = new ArrayList<>();
    }

    public boolean add(String person){
        if (searchBehavior.contains(people, person)){
            return false;
        }

        people.add(person);
        return true;
    }

    public boolean remove(String person){
        if (searchBehavior.contains(people, person)){
            people.remove(person);
            return true;
        }

        return false;
    }

    public String getTitle(){
        return this.title;
    }    

    public void setSearchBehavior(SearchBehavior searchBehavior){
        this.searchBehavior = searchBehavior;
    }

    public ArrayList<String> getList(){
        return this.people;
    }
}
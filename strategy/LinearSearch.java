package strategy;
import java.util.*;
//Written by Ashley Bickham
public class LinearSearch {
    boolean contains(ArrayList<String> data, String item) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).equals(item)) {
                return true;
            }
        }
        return false;

    }

  
    public static void main(String[] args) {
        ArrayList<String> testList = new ArrayList<>();
        testList.add("a");
        testList.add("b");
        testList.add("c");
        testList.add("d");

        for (int i = 0; i < testList.size(); i++) {
            System.out.println(testList.get(i));
        }
 
        LinearSearch test = new LinearSearch();
        System.out.println(test);
        System.out.println(test.contains(testList,"a"));
        System.out.println(test.contains(testList,"z"));
    }  

}

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
}

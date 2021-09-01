package strategy;

import java.util.*;

/**
 * A search algorithim that iterates consecutively through an ArrayList for the target String.
 * @author Ashley Bickham
 */
public class LinearSearch implements SearchBehavior {
    /**
     * Checks the indicated ArrayList for the target String
     * @param data The ArrayList to be searched
     * @param item The target String value
     * @return A boolean value indicating if the target string was found(true) or not(false)
     */
    public boolean contains(ArrayList<String> data, String item) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).toLowerCase().equals(item.toLowerCase())) {
                return true;
            }
        }
        return false;
    }
}

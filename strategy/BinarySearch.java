package strategy;

import java.util.*;

/**
 * A  search algorithim that iterates through an ArrayList for the target String using the Binary Search procedure.
 * @author Ashley Bickham
 */
public class BinarySearch implements SearchBehavior{
    /**
     * Checks the indicated ArrayList for the target String
     * @param data The ArrayList to be searched
     * @param item The target String value
     * @return A boolean value indicating if the target string was found(true) or not(false)
     */ 
     public boolean contains(ArrayList<String> data, String item) {
        int size = data.size(); 
        if (size > 1) {
            Collections.sort(data);
        }

        // Referenced this site for binary search implementation: https://www.tutorialspoint.com/data_structures_algorithms/binary_search_algorithm.htm
        int left = 0;
        int right = size - 1; 
        int mid = data.size()/2;

        while (left < (right + 1)){
            mid = left + (right - left) / 2;
            if (data.get(mid).toLowerCase().compareTo(item.toLowerCase()) < 0) {
                left = mid + 1;
            }
            else if (data.get(mid).toLowerCase().compareTo(item.toLowerCase()) > 0) {
                right = mid - 1;
            }
            else {
                return true;
                }
        }

        return false;
    }

} 
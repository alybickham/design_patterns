import java.util.*;
//Written by Ashley Bickham

public class BinarySearch implements SearchBehavior{
    public boolean contains(ArrayList<String> data, String item) {
        int size = data.size(); 
        if (size > 1) {
            Collections.sort(data);
        }

        // referenced this site for binary search implementation: https://www.tutorialspoint.com/data_structures_algorithms/binary_search_algorithm.htm
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
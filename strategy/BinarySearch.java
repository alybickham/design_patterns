import java.util.*;
//Written by Ashley Bickham

public class BinarySearch{
    public boolean contains(ArrayList<String> data, String item) {
        int size = data.size(); 
            if (size > 1) {
            Collections.sort(data);
            }
            int left = 0;
            int right = size - 1; 
            int mid = data.size()/2;
            while (left < (right + 1)){
                mid = left + right / 2;

                if (data.get(mid).compareTo(item) < 0) {
                    left = mid + 1;
                }
                else if (data.get(mid).compareTo(item) > 0) {
                    right = mid - 1;
                }
                else {
                    return true;
                }
            }
        return false;
    }      

}


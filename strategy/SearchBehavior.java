import java.util.*;

/**
 * Allows the user to implement two different search procedures.
 * @author Ashley Bickham
 */
public interface SearchBehavior {
    /**
     * Checks the indicated ArrayList for a target String
     * @param data The ArrayList to be searched
     * @param item The target String value
     * @return A boolean value indicating if the target string was found(true) or not(false)
     */
    public boolean contains(ArrayList<String> data, String item);
}
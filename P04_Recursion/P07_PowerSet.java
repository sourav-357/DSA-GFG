package P04_Recursion;
import java.util.*;

public class P07_PowerSet {
    
    public List<String> AllPossibleStrings(String s) {
        List<String> result = new ArrayList<>();
        generateSubsequence(0, s, "", result);
        Collections.sort(result);
        return result;
    }
    
    private void generateSubsequence(int index, String s, String current, List<String> result) {
        
        // Base case
        if (index == s.length()) {
            if (!current.isEmpty()) {
                result.add(current);
            }
            return;
        }
        
        // Include current character
        generateSubsequence(index + 1, s, current + s.charAt(index), result);
        
        // Exclude current character
        generateSubsequence(index + 1, s, current, result);
    }
}

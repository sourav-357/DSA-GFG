package ProblemOfTheDay;

import java.util.*;

class GenerateAllBinaryString {
    public ArrayList<String> binstr(int n) {
        ArrayList<String> result = new ArrayList<>();
        generate("", n, result);
        return result;
    }

    // Helper recursive function
    private void generate(String current, int n, ArrayList<String> result) {
        // Base case: when the string length is n, add to result
        if (current.length() == n) {
            result.add(current);
            return;
        }

        // Add '0' at current position
        generate(current + "0", n, result);

        // Add '1' at current position
        generate(current + "1", n, result);
    }
}

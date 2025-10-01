package ProblemOfTheDay;

import java.util.ArrayList;
import java.util.Arrays;

class AllUniquePermutationOfAnArray {
    public static ArrayList<ArrayList<Integer>> uniquePerms(int[] arr) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Arrays.sort(arr); // Sort the array to handle duplicates easily
        boolean[] used = new boolean[arr.length]; // To keep track of used elements in the current permutation
        backtrack(arr, used, new ArrayList<Integer>(), result);
        return result;
    }
    
    // Helper function to perform backtracking
    private static void backtrack(int[] arr, boolean[] used, ArrayList<Integer> current, ArrayList<ArrayList<Integer>> result) {
        // If the current permutation is of the same length as the original array, add it to the result
        if (current.size() == arr.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        
        for (int i = 0; i < arr.length; i++) {
            // Skip if the element is already used or if it's a duplicate (same as the previous element and the previous element hasn't been used)
            if (used[i] || (i > 0 && arr[i] == arr[i - 1] && !used[i - 1])) {
                continue;
            }
            
            // Choose the element arr[i]
            used[i] = true;
            current.add(arr[i]);
            
            // Recurse with the chosen element
            backtrack(arr, used, current, result);
            
            // Backtrack, un-choose the element
            used[i] = false;
            current.remove(current.size() - 1);
        }
    }
}

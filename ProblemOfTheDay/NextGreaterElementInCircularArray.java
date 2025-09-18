package ProblemOfTheDay;

import java.util.*;

class NextGreaterElementInCircularArray {
    public ArrayList<Integer> nextGreater(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>(Collections.nCopies(n, -1));
        Stack<Integer> st = new Stack<>();
        
        // Traverse twice because array is circular
        for (int i = 2 * n - 1; i >= 0; i--) {
            int idx = i % n;
            
            // Pop elements smaller or equal to arr[idx]
            while (!st.isEmpty() && st.peek() <= arr[idx]) {
                st.pop();
            }
            
            // If stack not empty, top is next greater
            if (i < n) {
                if (!st.isEmpty()) {
                    res.set(idx, st.peek());
                }
            }
            
            // Push current element
            st.push(arr[idx]);
        }
        
        return res;
    }
}
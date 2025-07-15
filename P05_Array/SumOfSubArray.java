// Given an array arr[] of positive integers, find the total sum of the minimum elements of every possible subarrays.

// Note: It is guaranteed that the total sum will fit within a 32-bit unsigned integer.

package P05_Array;

import java.util.Stack;

public class SumOfSubArray {
    public int sumSubMins(int[] arr) {
        int n = arr.length;
        int[] prevLess = new int[n];
        int[] nextLess = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            prevLess[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            stack.push(i);
        }

        stack.clear();
        
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            nextLess[i] = stack.isEmpty() ? n - i : stack.peek() - i;
            stack.push(i);
        }

        // Final result
        long result = 0;
        int MOD = (int)(1e9 + 7); 
        for (int i = 0; i < n; i++) {
            result += (long) arr[i] * prevLess[i] * nextLess[i];
        }

        return (int) result;
    }
}

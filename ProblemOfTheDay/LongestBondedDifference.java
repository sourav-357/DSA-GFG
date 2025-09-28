package ProblemOfTheDay;

import java.util.*;

class LongestBondedDifference {
    public ArrayList<Integer> longestSubarray(int[] arr, int x) {
        int n = arr.length;
        
        // Deque to maintain the current window's min and max
        Deque<Integer> minDeque = new LinkedList<>();
        Deque<Integer> maxDeque = new LinkedList<>();
        
        int start = 0, maxLength = 0, bestStart = 0;

        for (int end = 0; end < n; end++) {
            // Add current element to the deques
            while (!minDeque.isEmpty() && arr[minDeque.peekLast()] >= arr[end]) {
                minDeque.pollLast();
            }
            minDeque.offerLast(end);
            
            while (!maxDeque.isEmpty() && arr[maxDeque.peekLast()] <= arr[end]) {
                maxDeque.pollLast();
            }
            maxDeque.offerLast(end);
            
            // Check if the current window is valid
            while (arr[maxDeque.peekFirst()] - arr[minDeque.peekFirst()] > x) {
                start++;
                
                // Remove elements that are no longer in the window
                if (minDeque.peekFirst() < start) {
                    minDeque.pollFirst();
                }
                if (maxDeque.peekFirst() < start) {
                    maxDeque.pollFirst();
                }
            }

            // Check if this is the longest valid subarray found so far
            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                bestStart = start;
            }
        }

        // Prepare the result
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = bestStart; i < bestStart + maxLength; i++) {
            result.add(arr[i]);
        }
        return result;
    }
}

package ProblemOfTheDay;

import java.util.*;

class MinimizeTheMinimumDifference {
    public int maxMinDiff(int[] arr, int k) {
        Arrays.sort(arr);  // Step 1: sort
        
        int low = 1;  // min possible difference
        int high = arr[arr.length - 1] - arr[0];  // max possible difference
        int ans = 0;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (canPlace(arr, k, mid)) {
                ans = mid;     // mid is possible, try bigger
                low = mid + 1;
            } else {
                high = mid - 1;  // mid not possible, try smaller
            }
        }
        
        return ans;
    }
    
    private boolean canPlace(int[] arr, int k, int dist) {
        int count = 1; // pick first element
        int last = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - last >= dist) {
                count++;
                last = arr[i];
            }
            if (count >= k) return true;
        }
        
        return false;
    }
}

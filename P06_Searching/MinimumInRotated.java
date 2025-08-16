package P06_Searching;

public class MinimumInRotated {
    
}
class Solution {
    public int findMin(int[] arr) {
        int low = 0, high = arr.length - 1;
        
        // If the array is not rotated
        if (arr[low] <= arr[high]) {
            return arr[low];
        }
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            // Check if mid is the pivot (minimum)
            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                return arr[mid];
            }
            if (mid < arr.length - 1 && arr[mid] > arr[mid + 1]) {
                return arr[mid + 1];
            }

            // Decide which half to continue with
            if (arr[mid] >= arr[low]) {
                // Left half is sorted, pivot must be in right half
                low = mid + 1;
            } else {
                // Right half is sorted, pivot must be in left half
                high = mid - 1;
            }
        }
        
        return -1; // Should never reach here if input is valid
    }
}

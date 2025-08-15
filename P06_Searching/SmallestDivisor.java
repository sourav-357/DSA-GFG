package P06_Searching;

public class SmallestDivisor {
    
}
class Solution {
    int smallestDivisor(int[] arr, int k) {
        
        // Declaring constraints 
        int maxVal = 0;
        for (int num : arr) {
            if (num > maxVal) {
                maxVal = num;
            }
        }
        int low = 1, high = maxVal, ans = -1, mid = 0, sum = 0;
        
        while (low <= high) { // Doing Binary Search
            mid = (low + high)/2;
            sum = 0;
            
            // adding up all the rounded quotients
            for (int i = 0; i < arr.length; i++) {
                sum += (arr[i] + mid - 1) / mid; // rounding the Quotient
            } 
            if (sum <= k) {
                ans = mid; // Store the possible output
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}

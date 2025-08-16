// Given a sorted array, arr[] containing only 0s and 1s, find the transition point, i.e., the first index where 1 was observed, and before that, only 0 was observed.  If arr does not have any 1, return -1. If array does not have any 0, return 0.

package P06_Searching;

public class FindTransitionPoint {
    
}
class Solution {
    int transitionPoint(int arr[]) {
        
        // Declaring the Constraints 
        int low = 0, high = arr.length - 1, mid = 0, ans = -1;
        
        // Starting the Binary Search 
        while (low <= high) {
            // Calculating the mid Value 
            mid = (low + high)/2;
            
            // Checking Conditions One by One 
            if (arr[mid] == 1) {
                ans = mid;
                high = mid - 1; // Searching for the more lowest elements 
            
            } else if (arr[mid] == 0) {
                low = mid + 1;
            }
        }
        return ans;
    }
}
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
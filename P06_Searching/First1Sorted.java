package P06_Searching;

public class First1Sorted {
    
}
class Solution {

    public long firstIndex(int arr[]) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == 1) {
                ans = mid;       // possible first index
                high = mid - 1;  // search in left half
            } else {
                low = mid + 1;   
            }
        }

        return ans;
    }
}

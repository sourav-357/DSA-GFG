package P06_Searching;

class BinarySearch {
    static int binarysearch(int arr[], int k) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == k) {
                ans = mid;
                high = mid - 1; // move left to find smaller index
            } 
            else if (arr[mid] > k) {
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }
        
        return ans;
    }
}

package P06_Searching;

// User function Template for Java
class SearchInAnAlmostSortedArray {
    public int findTarget(int arr[], int target) {
        
        int low = 0, high = arr.length-1, mid = 0;
        
        while (low <= high) {
            mid = (low+high)/2;
            
            if(arr[mid] == target) {
                return mid;
            } else if (mid < high && arr[mid + 1] == target) {
                return mid + 1;
            } else if (mid > low && arr[mid - 1] == target) {
                return mid - 1;
            } else if (arr[mid] > target) {
                high = mid - 2;
            } else {
                low = mid + 2;
            }
        }
        return -1;
    }
}

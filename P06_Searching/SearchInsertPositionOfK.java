package P06_Searching;

class SearchInsertPositionOfK {
    public int searchInsertK(int arr[], int k) {
        
        int low = 0, high = arr.length - 1, mid = 0;
        
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}

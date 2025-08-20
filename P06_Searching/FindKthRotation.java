package P06_Searching;

class FindKthRotation {
    public int findKRotation(int arr[]) {
        
        int low = 0, high = arr.length - 1 ;

        while (low <= high) {
             
            // smallest is at low
            if (arr[low] <= arr[high])
                return low ;

            int mid = (low + high) / 2 ;

            // Minimum is in the right half
            if (arr[mid] > arr[high])
                low = mid + 1 ;

            // Minimum is in the left half (could be mid)
            else
                high = mid ;
        }
        return low;
    }
}
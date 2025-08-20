package P06_Searching;

class SingleAmongDoublesInSortedArray {
    int single(int[] arr) {
        
        int lo = 0, hi = arr.length - 1;
        
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            
            // Ensure mid is odd
            if (mid % 2 == 1)
                mid--;
            
            // single element must be on the right side
            if (arr[mid] == arr[mid + 1]) {
                lo = mid + 2;
            } 
          
            // Else single element must be on the left  
            else {
                hi = mid;
            }
        }
        
        return arr[lo];  
    }
}

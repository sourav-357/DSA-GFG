package P06_Searching;

class NumberOfOccourance {
    int countFreq(int[] arr, int target) {
        
        int first = firstOcc(arr, target);
        int second = lastOcc(arr, target);
    
        return (second - first);
    }
    
    int firstOcc(int arr[], int x) {
        int low = 0;
        int high = arr.length-1;
        int mid = 0;
        
        while(low <= high) {
            mid = (low + high)/2;
            if(arr[mid] == x) {
                if(mid == 0 || arr[mid] != arr[mid-1]) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if(arr[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
    int lastOcc(int arr[], int x) {
        int low = 0;
        int high = arr.length-1;
        int mid = 0;
        
        while(low <= high) {
            mid = (low + high)/2;
            if(arr[mid] == x) {
                if(mid == arr.length-1 || arr[mid] != arr[mid+1]) {
                    return mid + 1;
                } else {
                    low = mid + 1;
                }
            } else if(arr[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}

package P06_Searching;

import java.util.ArrayList;

public class FirstLastOccourance {
    
}
// User function Template for Java

class GFG {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        int first = firstOcc(arr, x);
        int second = lastOcc(arr, x);
        
        ArrayList<Integer> result = new ArrayList<>();
        result.add(first);
        result.add(second);
        return result;
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
                    return mid;
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

package P06_Searching;

public class PeakValue {
    public static void main(String[] args) {
        int arr[] = {8, 5, 10, 8, 7, 6, 1, 3};
        int x = peakElement(arr);
        System.out.println(x);
    }
    public static int peakElement(int[] arr) {
        // code here
        int low = 0, high = arr.length - 1;
        int mid = 0;
        while (low <= high) {
            if (arr.length == 1) {
                return 0;
            }
            mid = (low + high) / 2;
            if(mid == 0) {
                if(arr[mid] > arr[mid + 1]) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            } 
            if(mid == arr.length - 1) {
                if(arr[mid] > arr[mid - 1]) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            }
            if(arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
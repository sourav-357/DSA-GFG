package P07_Sorting;

public class InsertionSort {
    
}
class Solution {
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
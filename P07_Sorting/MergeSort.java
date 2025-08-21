// Given an array arr[], its starting position l and its ending position r. Sort the array using the merge sort algorithm.

package P07_Sorting;

class MergeSort {
    
    void mergeSort(int arr[], int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;
            
            // Recursively sort both halves
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
    
    void merge(int arr[], int l, int m, int r) {
        // Sizes of two subarrays
        int n1 = m - l + 1;
        int n2 = r - m;
        
        // Create temporary arrays
        int L[] = new int[n1];
        int R[] = new int[n2];
        
        // Copy data to temp arrays
        for (int i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[m + 1 + j];
        
        // Merge temp arrays
        int i = 0, j = 0;
        int k = l;
        
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        
        // Copy remaining elements of L[]
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        
        // Copy remaining elements of R[]
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}

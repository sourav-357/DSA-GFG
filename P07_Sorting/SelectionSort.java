package P07_Sorting;

class SelectionSort {
    void selectionSort(int[] arr) {
        
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
          
            // Assume the current position holds the minimum element
            int min_idx = i;

            // Iterate through the unsorted portion to find the actual minimum
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                  
                    // Update min_idx if a smaller element is found
                    min_idx = j;
                }
            }

            // Move minimum element to its correct position
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
    }

    @Override
    public String toString() {
        return "SelectionSort []";
    }
}

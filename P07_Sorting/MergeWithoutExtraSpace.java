// Given two sorted arrays a[] and b[] of size n and m respectively, 
// the task is to merge them in sorted order without using any extra space. 
// Modify a[] so that it contains the first n elements and modify b[] so that it contains the last m elements.

package P07_Sorting;

import java.util.Arrays;

class MergeWithoutExtraSpace {
    public void mergeArrays(int a[], int b[]) {
        int i = a.length - 1, j = 0;

        // Swap smaller elements from b[] with larger elements from a[]
        while (i >= 0 && j < b.length) {
            if (a[i] < b[j])
                i--;
            else {
                int temp = b[j];
                b[j] = a[i];
                a[i] = temp;
                i--;
                j++;
            }
        }

        // Sort both arrays
        Arrays.sort(a);
        Arrays.sort(b);
    }
}

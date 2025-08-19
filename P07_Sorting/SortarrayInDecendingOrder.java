package P07_Sorting;

// Java Program to Sort the Elements in
// Descending Order by Sorting and Reversing
import java.util.Arrays;

class SortarrayInDecendingOrder {
     
    public static void main(String[] args) {
       
        int a[] = { 1, 2, 3, 4, 5 };

        // sort the array in ascending order
        Arrays.sort(a);

        // reverse the array
        reverse(a);

        System.out.println(Arrays.toString(a));
    }
  
    // method to reverse the array elements
    public static void reverse(int[] a)
    {
        // length of an array
        int n = a.length;

        // swap the first half with the second half
        for (int i = 0; i < n / 2; i++) {

            // Store the first half elements temporarily
            int t = a[i];

            // Assign the first half
            // to the last half
            a[i] = a[n - i - 1];

            // Assign the last half
            // to the first half
            a[n - i - 1] = t;
        }
    }
}
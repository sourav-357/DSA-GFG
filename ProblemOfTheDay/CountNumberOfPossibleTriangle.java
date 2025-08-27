package ProblemOfTheDay;

import java.util.Arrays;

class CountNumberOfPossibleTriangle {
    public int countTriangles(int arr[]) {
        // code here
        int n = arr.length;
        if (n < 3) return 0;

        Arrays.sort(arr); // Step 1: sort the array
        int count = 0;

        // Step 2: fix the largest side one by one
        for (int k = n - 1; k >= 2; k--) {
            int i = 0, j = k - 1;

            // Step 3: use two pointers
            while (i < j) {
                if (arr[i] + arr[j] > arr[k]) {
                    // All elements between i and j-1 with j will form valid triangles
                    count += (j - i);
                    j--;
                } else {
                    i++;
                }
            }
        }

        return count;
    }
}
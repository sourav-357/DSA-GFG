// Given a row-wise sorted matrix mat[][] of size n*m, 
// where the number of rows and columns is always odd. Return the median of the matrix.

package ProblemOfTheDay;

class MedianInRowWiseSortedMatrix {
    public int median(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        // Minimum and maximum elements in the matrix
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            low = Math.min(low, mat[i][0]);         // first element in row (smallest)
            high = Math.max(high, mat[i][m - 1]);   // last element in row (largest)
        }

        int desired = (n * m) / 2;

        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = 0;

            // Count how many numbers are ≤ mid
            for (int i = 0; i < n; i++) {
                count += countLessOrEqual(mat[i], mid);
            }

            if (count <= desired) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    // Helper function to count elements ≤ target in a sorted row
    private int countLessOrEqual(int[] row, int target) {
        int l = 0, r = row.length;

        while (l < r) {
            int mid = l + (r - l) / 2;
            if (row[mid] <= target) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }

        return l;
    }
}

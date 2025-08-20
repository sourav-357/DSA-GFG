package ProblemOfTheDay;

public class SearchInFullyRotatedmatrix {
    
}
class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        int n = mat.length, m = mat[0].length;
        int low = 0, high = n * m - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            // Convert 1D index to 2D (row, col)
            int row = mid / m;
            int col = mid % m;
            int val = mat[row][col];
            
            if (val == x) return true;
            
            // Apply rotated binary search logic
            int lowRow = low / m, lowCol = low % m;
            int highRow = high / m, highCol = high % m;
            
            int lowVal = mat[lowRow][lowCol];
            int highVal = mat[highRow][highCol];
            
            if (lowVal <= val) { // Left half is sorted
                if (lowVal <= x && x < val) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else { // Right half is sorted
                if (val < x && x <= highVal) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        
        return false;
    }
}
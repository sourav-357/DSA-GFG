package P06_Searching;

public class SquareRoot {
    
}
class Solution {
    int floorSqrt(int n) {
        if (n == 0 || n == 1) return n;

        int low = 1, high = n, ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            long sq = (long) mid * mid; // use long to prevent overflow

            if (sq == n) {
                return mid;
            } else if (sq < n) {
                ans = mid; // possible floor
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}

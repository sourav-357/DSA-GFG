/*
You are given an array arr[] of non-negative numbers. Each number tells you the maximum number of steps you can jump forward from that position.

If arr[i] = 3, you can jump to index i + 1, i + 2, or i + 3 from position i.
If arr[i] = 0, you cannot jump forward from that position.
Your task is to find the minimum number of jumps needed to move from the first position in the array to the last position.

Note:  Return -1 if you can't reach the end of the array.
*/

package P05_Array;

public class MinimumJumps {
    static int minJumps(int[] arr) {
        int n = arr.length;
        if (n <= 1)
            return 0;
        if (arr[0] == 0)
            return -1;

        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        for (int i = 0; i < n - 1; i++) {
            farthest = Math.max(farthest, i + arr[i]);

            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;

                if (currentEnd >= n - 1)
                    break;
            }

            if (currentEnd <= i) {
                return -1;
            }
        }

        return currentEnd >= n - 1 ? jumps : -1;
    }
}

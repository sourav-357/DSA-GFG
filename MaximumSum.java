// Given an integer array arr[]. Find the maximum value of the sum of i*arr[i] for all 0 ≤ i ≤ arr.size()-1. The only operation allowed is to rotate(clockwise or counterclockwise) the array any number of times.

public class MaximumSum {
    int maxSum(int[] arr) {
        int n = arr.length;

        int arrSum = 0;
        for (int i = 0; i < n; i++) {
            arrSum += arr[i];
        }

        int currVal = 0;
        for (int i = 0; i < n; i++) {
            currVal += i * arr[i];
        }
        int maxVal = currVal;

        for (int i = 1; i < n; i++) {
            currVal = currVal + arrSum - n * arr[n - i];
            maxVal = Math.max(maxVal, currVal);
        }

        return maxVal;
    }
}

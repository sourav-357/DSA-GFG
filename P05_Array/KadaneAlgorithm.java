// You are given an integer array arr[]. You need to find the maximum sum of a subarray (containing at least one element) in the array arr[].

package P05_Array;

public class KadaneAlgorithm {
    int maxSubarraySum(int[] arr) {
        int maxSoFar = arr[0];
        int maxEndingHere = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }
}

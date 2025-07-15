// Given an array arr[] containing only non-negative integers, your task is to find a continuous subarray (a contiguous sequence of elements) whose sum equals a specified value target. You need to return the 1-based indices of the leftmost and rightmost elements of this subarray. You need to find the first subarray whose sum is equal to the target.

package P05_Array;

import java.util.ArrayList;

public class IndexesOfSubarraySum {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> result = new ArrayList<>();
        int start = 0;
        int currentSum = 0;

        for (int end = 0; end < arr.length; end++) {
            currentSum += arr[end];

            while (currentSum > target && start < end) {
                currentSum -= arr[start];
                start++;
            }
            if (currentSum == target) {
                result.add(start + 1);
                result.add(end + 1);
                return result;
            }
        }
        result.add(-1);
        return result;
    }
}
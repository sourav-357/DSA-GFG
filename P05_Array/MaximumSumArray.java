package P05_Array;
// Given an array of integers arr[], find the contiguous subarray with the maximum sum that contains only non-negative numbers. If multiple subarrays have the same sum, return the one with the smallest starting index. If the array contains only negative numbers, return -1.

// Note: A subarray is a contiguous non-empty sequence of elements within an array.

import java.util.ArrayList;

public class MaximumSumArray {
    public ArrayList<Integer> findSubarray(int arr[]) {
        long max_sum = -1;        
        long cur_sum = 0;         
        int max_range_left = -1;  
        int max_range_right = -1; 
        int cur_range_left = 0;  
        int cur_range_right = 0; 
        int n = arr.length;       

        while (cur_range_right < n) {
            if (arr[cur_range_right] < 0) {
                cur_range_left = cur_range_right + 1; 
                cur_sum = 0;                          
            } else {
                cur_sum +=
                    (long)arr[cur_range_right]; 
                if (cur_sum > max_sum) {
                    max_sum = cur_sum;
                    max_range_left = cur_range_left;
                    max_range_right = cur_range_right;
                } else if (cur_sum == max_sum) {
                    if (cur_range_right + 1 - cur_range_left >
                        max_range_right + 1 - max_range_left) {
                        max_range_left = cur_range_left;
                        max_range_right = cur_range_right;
                    }
                }
            }
            cur_range_right++; 
        }

        ArrayList<Integer> ans = new ArrayList<>(); 
        if (max_range_left == -1 || max_range_right == -1) {
            ans.add(-1);
            return ans;
        }
        for (int i = max_range_left; i <= max_range_right; ++i)
            ans.add(arr[i]); 
        return ans; 
    }
}

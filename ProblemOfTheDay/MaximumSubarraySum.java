package ProblemOfTheDay;

class MaximumSubarraySum {
    public int maxSubarrSum(int[] arr, int a, int b) {
        int n = arr.length;
        int[] prefix = new int[n + 1];
        
        // Compute prefix sum array
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
        }
        
        int maxSum = Integer.MIN_VALUE;
        
        // Iterate through the array and find the maximum subarray sum
        for (int end = a; end <= n; end++) {
            for (int start = Math.max(0, end - b); start < end - a + 1; start++) {
                int currentSum = prefix[end] - prefix[start];
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        
        return maxSum;
    }
}

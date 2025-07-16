// Given an array of positive numbers, the task is to find the number of possible contiguous subarrays having product less than a given number k.

public class SubArrayProduct {
    public long countSubArrayProductLessThanK(long arr[], int n, long k) {
        if (k <= 1)
            return 0;
        long count = 0, prod = 1;
        int left = 0;

        for (int right = 0; right < n; right++) {
            prod *= arr[right];
            while (prod >= k) {
                prod /= arr[left++];
            }
            count += right - left + 1;
        }

        return count;
    }
}

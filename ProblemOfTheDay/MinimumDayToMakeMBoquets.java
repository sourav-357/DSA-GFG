/*
You have a row of flowers, where each flower blooms after a specific day. 
The array arr[] represents the blooming schedule: arr[i] is the day the flower at position i will bloom. 
To create a bouquet, you need to collect k adjacent bloomed flowers. 
Each flower can only be used in one bouquet.

Your goal is to find the minimum number of days required to make exactly m bouquets. 
If it is not possible to make m bouquets with the given arrangement, return -1. 
*/

package ProblemOfTheDay;

class MinimumDayToMakeMBoquets {
    public int minDaysBloom(int[] arr, int k, int m) {
        int n = arr.length;
        long total = (long) m * k;
        if (total > n) return -1; // not enough flowers

        int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;
        for (int day : arr) {
            low = Math.min(low, day);
            high = Math.max(high, day);
        }

        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canMake(arr, mid, k, m)) {
                ans = mid;
                high = mid - 1; // try smaller day
            } else {
                low = mid + 1; // need more days
            }
        }
        return ans;
    }

    private boolean canMake(int[] arr, int day, int k, int m) {
        int count = 0; // consecutive bloomed flowers
        int bouquets = 0;

        for (int bloom : arr) {
            if (bloom <= day) {
                count++;
                if (count == k) {
                    bouquets++;
                    count = 0;
                }
            } else {
                count = 0; // break streak
            }
            if (bouquets >= m) return true;
        }
        return false;
    }
}

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

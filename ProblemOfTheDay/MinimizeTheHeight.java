package ProblemOfTheDay;

import java.util.Arrays;

class MinimizeTheHeight {
    public int getMinDiff(int[] arr, int k) {
        int n = arr.length;
        if (n == 1) return 0;

        Arrays.sort(arr);
        
        int ans = arr[n - 1] - arr[0];

        int min_elem = arr[0] + k;
        int max_elem = arr[n - 1] - k;

        for (int i = 1; i < n; i++) {
            int min = Math.min(min_elem, arr[i] - k);
            int max = Math.max(max_elem, arr[i - 1] + k);

            // Skip if result in negative height
            if (min < 0) continue;

            ans = Math.min(ans, max - min);
        }

        return ans;
    }
}

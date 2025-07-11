public class TrailsOfOnes {
    public int countConsec(int n) {
        if (n == 0)
            return 0;

        // Count valid strings without consecutive 1s
        int[] dp0 = new int[n + 1];
        int[] dp1 = new int[n + 1];

        dp0[1] = 1; // "0"
        dp1[1] = 1; // "1"

        for (int i = 2; i <= n; i++) {
            dp0[i] = dp0[i - 1] + dp1[i - 1];
            dp1[i] = dp0[i - 1];
        }

        int valid = dp0[n] + dp1[n];

        // Total binary strings of length n
        int total = (int) Math.pow(2, n);

        // Result = total - valid
        return total - valid;
    }
}

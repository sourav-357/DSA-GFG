/*
As the clock struck midnight on New Year's Eve, Geek bid farewell to the wasted moments of 2023, realizing the untapped potential of GFG's Problem of the Day.

His 2024 resolution: Solve POTD every day.

Eager to earn coins for GFG Merchandise, Geek faces new rules:

Earning Coin: Geek can accumulate coins[i] by solving the POTD on the ith day, where 1 <= coins[i] <= 2024 and the sum of coins <= 2024.
Merchandise Eligibility: To purchase merchandise, Geeks should solve atleast one POTD and the coins earned must be divisible by 20 or 24, or precisely equal to 2024.
Geek's resolutions often fades over time. Realistically, he can only commit to active participation for N (where N ≤ 366) days. Given the value of N and number of coins associated with each POTD, can Geek strategically solve some (or all) POTDs to become eligible for redeeming merchandise?
*/

package P04_Recursion;

public class NewYearResolution {
    public static boolean isPossible(int N, int[] coins) {
        boolean[] dp = new boolean[2025];
        dp[0] = true;

        for (int coin : coins) {

            for (int i = 2024; i >= coin; i--) {
                if (dp[i - coin]) {
                    dp[i] = true;
                }
            }
        }

        for (int i = 1; i <= 2024; i++) {
            if (dp[i] && (i % 20 == 0 || i % 24 == 0 || i == 2024)) {
                return true;
            }
        }

        return false;
    }
}

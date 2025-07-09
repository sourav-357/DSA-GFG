// There are n stairs, a person standing at the bottom wants to reach the top. The person can climb either 1 stair or 2 stairs at a time. Your task is to count the number of ways, the person can reach the top (order does matter).

package P02_Mathematics;

public class MediumProgram4 {
    int countWays(int n) {
        if (n == 0 || n == 1)
            return 1;

        int prev2 = 1; // ways(0)
        int prev1 = 1; // ways(1)

        for (int i = 2; i <= n; i++) {
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}

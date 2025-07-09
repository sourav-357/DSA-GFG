// A lucky number is defined using a special elimination process:
//    1. Start with natural numbers: 1, 2, 3, 4, 5, 6, ...
//    2. In the 1st step, remove every 2nd number.
//    3. In the 2nd step, remove every 3rd remaining number.
//    4. In the 3rd step, remove every 4th remaining number, and so on...
// This continues indefinitely. Given an integer n, determine if it remains after all steps.
// Return 1 if n is a lucky number, otherwise return 0.

package P02_Mathematics;

public class Mediumprogram5 {
    public static boolean isLucky(int n) {
        return isLuckyHelper(n, 2);
    }

    private static boolean isLuckyHelper(int n, int step) {
        if (step > n)
            return true; // survived all rounds
        if (n % step == 0)
            return false; // eliminated in this round

        // Position shifts after eliminations
        int newPos = n - (n / step);
        return isLuckyHelper(newPos, step + 1);
    }
}

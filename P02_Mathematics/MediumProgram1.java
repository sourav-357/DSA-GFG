// Given a positive integer n. You have to find nth natural number after removing all the numbers containing the digit 9.

package P02_Mathematics;

public class MediumProgram1 {
    long findNth(long n) {
        // code here

        long ans = 0;
        long multiplier = 1;

        while (n > 0) {
            long rem = n % 9;
            ans += rem * multiplier;
            multiplier *= 10;
            n /= 9;
        }

        return ans;
    }
}

// You are given a number n. You need to find the sum of digits of n.

package P04_Recursion;

public class SumOfDigits {
    public static int sumOfDigits(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }
}

// Given a number n, find the value of n raised to the power of its own reverse.
// Note: The result will always fit into a 32-bit signed integer.

package P04_Recursion;

public class PowerOfNumbers {
    public int reverseExponentiation(int n) {
        int rev = reverse(n);
        return power(n, rev);
    }

    private int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev;
    }

    private int power(int base, int exp) {
        int result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result *= base;
            }
            base *= base;
            exp >>= 1;
        }
        return result;
    }
}

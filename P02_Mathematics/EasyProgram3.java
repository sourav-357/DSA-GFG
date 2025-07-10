package P02_Mathematics;

public class EasyProgram3 {
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

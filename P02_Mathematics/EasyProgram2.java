// Given a number n, check if the number is perfect or not. A number is said to be perfect if sum of all its factors excluding the number itself is equal to the number.

package P02_Mathematics;

public class EasyProgram2 {
    static boolean isPerfect(int n) {
        int sum = 0;

        // check all numbers from 1 to n-1
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n && i != 1) {
                    sum += (n / i);
                }
            }
        }
        return (sum == n);
    }
}

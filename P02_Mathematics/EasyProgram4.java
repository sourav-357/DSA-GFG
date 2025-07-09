// Given a positive integer n, The task is to find the value of Σi F(i) where i is from 1 to n and function F(i) is defined as the sum of all divisors of i.

package P02_Mathematics;

public class EasyProgram4 {
    public static long sumOfDivisors(long n) {
        long sum = 0;

        for (int number = 1; number <= n; number++) {
            long divisorsum = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    divisorsum += i;
                }
            }
            sum += divisorsum;
        }
        return sum;
    }
}

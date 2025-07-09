// Given a number n, your task is to find the largest prime factor of n.

package P02_Mathematics;

public class MediumProgram6 {
    static int largestPrimeFactor(int n) {

        int maxPrime = -1;

        while (n % 2 == 0) {
            maxPrime = 2;
            n /= 2;
        }

        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                maxPrime = i;
                n /= i;
            }
        }

        if (n > 2) {
            maxPrime = n;
        }

        return maxPrime;
    }
}

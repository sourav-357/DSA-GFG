// Consider the generalized Fibonacci number g, which is dependent on a, b and c as follows :-
// g(1) = 1, g(2) = 1. For any other number n, g(n) = a*g(n-1) + b*g(n-2) + c.

// For a given value of m, determine g(n)%m.

package P02_Mathematics;

public class HardProgram2 {
    static long genFibNum(Long a, Long b, Long c, long n, long m) {
        if (n == 1 || n == 2)
            return 1 % m;

        long[][] base = {
                { a % m, b % m, c % m },
                { 1, 0, 0 },
                { 0, 0, 1 }
        };

        long[][] res = matrixPower(base, n - 2, m);

        // Initial vector: g(2) = 1, g(1) = 1, constant term = 1
        long[] init = { 1, 1, 1 };

        long ans = 0;
        for (int i = 0; i < 3; i++) {
            ans = (ans + res[0][i] * init[i] % m) % m;
        }

        return ans;
    }

    static long[][] matrixPower(long[][] mat, long power, long mod) {
        int size = mat.length;
        long[][] result = new long[size][size];

        // Identity matrix
        for (int i = 0; i < size; i++)
            result[i][i] = 1;

        while (power > 0) {
            if ((power & 1) == 1) {
                result = multiply(result, mat, mod);
            }
            mat = multiply(mat, mat, mod);
            power >>= 1;
        }

        return result;
    }

    static long[][] multiply(long[][] A, long[][] B, long mod) {
        int n = A.length;
        long[][] res = new long[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                long sum = 0;
                for (int k = 0; k < n; k++) {
                    sum = (sum + A[i][k] * B[k][j] % mod) % mod;
                }
                res[i][j] = sum;
            }
        }
        return res;
    }
}

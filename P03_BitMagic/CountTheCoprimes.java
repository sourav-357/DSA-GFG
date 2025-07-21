// You are given an array arr[] of positive integers. Your task is to count the number of pairs (i, j) such that:

// 0 ≤ i < j ≤ n-1
// gcd(arr[i], arr[j]) = 1
// In other words, count the number of unordered pairs of indices (i, j) where the elements at those positions are co-prime.

package P03_BitMagic;

public class CountTheCoprimes {
    int cntCoprime(int[] arr) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (gcd(arr[i], arr[j]) == 1) {
                    count++;
                }
            }
        }
        return count;
    }

    // Helper method to compute GCD
    int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}

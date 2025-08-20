package P06_Searching;

class KthElementOfTwoArray {
    public int kthElement(int a[], int b[], int k) {
        int n = a.length, m = b.length;

        // Ensure a is the smaller array
        if (n > m) return kthElement(b, a, k);

        int low = Math.max(0, k - m), high = Math.min(k, n);

        while (low <= high) {
            int cutA = (low + high) / 2;
            int cutB = k - cutA;

            int leftA  = (cutA == 0) ? Integer.MIN_VALUE : a[cutA - 1];
            int leftB  = (cutB == 0) ? Integer.MIN_VALUE : b[cutB - 1];
            int rightA = (cutA == n) ? Integer.MAX_VALUE : a[cutA];
            int rightB = (cutB == m) ? Integer.MAX_VALUE : b[cutB];

            if (leftA <= rightB && leftB <= rightA) {
                return Math.max(leftA, leftB);
            } else if (leftA > rightB) {
                high = cutA - 1;
            } else {
                low = cutA + 1;
            }
        }

        return -1; // should never hit
    }
}

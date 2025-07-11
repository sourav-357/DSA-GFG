public class FindPOSITION {
    static int findPosition(int n) {
        // No set bit at all
        if (n == 0)
            return -1;

        // Check that exactly ONE bit is set.
        // For powers of two, n & (n‑1) is 0.
        if ((n & (n - 1)) != 0)
            return -1;

        /*
         * At this point n is a power of two, so the answer is the index
         * (1‑based from the right) of its single set bit.
         * Integer.numberOfTrailingZeros(n) gives 0‑based index of that bit.
         */
        return Integer.numberOfTrailingZeros(n) + 1;
    }
}

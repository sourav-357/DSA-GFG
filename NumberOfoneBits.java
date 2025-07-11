public class NumberOfoneBits {
    static int setBits(int n) {
        // code here
        int count = 0;

        while (n > 0) {
            n &= (n - 1); // removes the lowest set bit
            count++;
        }

        return count;
    }
}

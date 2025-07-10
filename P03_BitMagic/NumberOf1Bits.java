// Given a positive integer n. Your task is to return the count of set bits.

package P03_BitMagic;

public class NumberOf1Bits {
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

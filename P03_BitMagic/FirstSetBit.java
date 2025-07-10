// Given an integer n. You have to return the position of the first set bit  from the right side in the binary representation of the number. If there is no set bit in the integer N, then return 0 from the function. 

package P03_BitMagic;

public class FirstSetBit {
    public static int getFirstSetBit(int n) {
        if (n == 0)
            return 0;

        int position = 1;
        while ((n & 1) == 0) {
            n >>= 1;
            position++;
        }

        return position;
    }
}

// Given a non-negative integer n. You have to check if it is a power of 2 or not. 

package P03_BitMagic;

public class PowerOf2 {
    public static boolean isPowerofTwo(int n) {
        // code here
        return n > 0 && (n & (n - 1)) == 0;
    }
}

package P03_BitMagic;

public class PowerOf2 {
    public static boolean isPowerofTwo(int n) {
        // code here
        return n > 0 && (n & (n - 1)) == 0;
    }
}

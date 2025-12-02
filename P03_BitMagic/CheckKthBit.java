// Given two positive integer n and  k, check if the kth index bit of n is set or not.
// Note: A bit is called set if it is 1. 

package P03_BitMagic;

public class CheckKthBit {
    static boolean checkKthBit(int n, int k) {
        // code here
        return (n & (1 << k)) != 0;
    }
    public static void main(String[] args) {
        int n = 5; // Binary: 101
        int k = 2; // Check if the 2nd bit is set
        boolean result = checkKthBit(n, k);
        System.out.println("Is the " + k + "th bit of " + n + " set? " + result);
        
        n = 5; // Binary: 101
        k = 1; // Check if the 1st bit is set
        result = checkKthBit(n, k);
        System.out.println("Is the " + k + "th bit of " + n + " set? " + result);
    }
}

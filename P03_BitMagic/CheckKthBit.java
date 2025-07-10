// Given two positive integer n and  k, check if the kth index bit of n is set or not.
// Note: A bit is called set if it is 1. 

package P03_BitMagic;

public class CheckKthBit {
    static boolean checkKthBit(int n, int k) {
        // code here
        return (n & (1 << k)) != 0;
    }
}

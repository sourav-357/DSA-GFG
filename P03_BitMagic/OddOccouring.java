// Given an array of arr[] positive integers where all numbers occur even number of times except one number which occurs odd number of times. Return that number.

package P03_BitMagic;

public class OddOccouring {
    int getOddOccurrence(int[] arr) {
        // code here
        int result = 0;
        for (int num : arr) {
            result ^= num; // XOR all elements
        }
        return result;
    }
}

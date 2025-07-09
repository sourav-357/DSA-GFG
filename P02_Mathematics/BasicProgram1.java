// Given an integer n, your task is to compute the sum of all natural numbers from 1 to n (inclusive). If n is 0, the sum should be 0.

package P02_Mathematics;

public class BasicProgram1 {

    public static int findSum(int n) {
        // code here
        return ((n * (n + 1)) / 2);
    }
}

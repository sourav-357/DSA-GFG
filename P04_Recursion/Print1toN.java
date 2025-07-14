// Given an positive integer n, print numbers from 1 to n without using loops.

package P04_Recursion;

public class Print1toN {
    static void printTillN(int N) {
        if (N == 0)
            return;

        printTillN(N - 1);
        System.out.print(N + " ");
    }
}

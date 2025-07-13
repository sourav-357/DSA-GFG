// You are given an integer n. You have  to print all numbers from 1 to n.
// Note: You must use recursion only, and print all numbers from 1 to n in a single line, separated by spaces.

package P04_Recursion;

public class PrintingNwithoutLoop {
    public void printNos(int n) {
        print(1, n);
    }

    private void print(int i, int n) {
        if (i > n)
            return;
        System.out.print(i + " ");
        print(i + 1, n);
    }
}

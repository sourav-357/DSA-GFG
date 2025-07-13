// Print GFG n times without the loop.

package P04_Recursion;

public class PrintingNtimesWithoutLoop {
    void printGfg(int N) {
        if (N == 0)
            return; // base case
        System.out.print("GFG "); // print once
        printGfg(N - 1); // recurse for the rest
    }
}

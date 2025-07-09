// Given a positive integer, n. Find the factorial of n.

package P02_Mathematics;

public class BasicsProgram4 {
    static int factorial(int n) {
        // code here
        if(n==0)
        return 1;
        return n* factorial(n-1);
        
    }
}

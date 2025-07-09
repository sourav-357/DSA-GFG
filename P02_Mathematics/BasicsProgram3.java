// Given two integers a and b, You have to compute their LCM and GCD and return an array containing their LCM and GCD.

package P02_Mathematics;

public class BasicsProgram3 {
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        int gcd = findGCD(a, b);
        int lcm = (a * b) / gcd;
        return new int[] { lcm, gcd };
    }

    private static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

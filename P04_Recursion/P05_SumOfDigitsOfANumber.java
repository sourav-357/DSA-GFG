
// we need to find the sum of digits of a number using recursion

package P04_Recursion;

public class P05_SumOfDigitsOfANumber {
    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0; // Base case: if n is 0, sum of digits is 0
        } 
        return (n % 10) + sumOfDigits(n / 10); // Recursive call
    }

    public static void main(String[] args) {
        int n = 1234; // Example input
        int result = sumOfDigits(n); // Call the function to get sum of digits
        System.out.println("Sum of digits of " + n + " is: " + result); // Print the result
    }
}

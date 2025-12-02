package P04_Recursion;

public class Print1ToNWithoutUsingLoops {

    public static void printNumbers(int n) {
        if (n <= 0) {
            return; // Base case: if n is less than or equal to 0, do nothing
        }
        printNumbers(n - 1); // Recursive call with n-1
        System.out.print(n + " "); // Print the current number after the recursive call
    }

    public static void main(String[] args) {
        int n = 5; // Example input
        printNumbers(n); // Call the function to print numbers from 1 to n
    }

}

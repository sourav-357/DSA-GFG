// You are given an array arr[] of size n - 1 that contains distinct integers in the range from 1 to n (inclusive). This array represents a permutation of the integers from 1 to n with one element missing. Your task is to identify and return the missing element.

package P03_BitMagic;

public class MissingInArray {
    int missingNum(int arr[]) {
        // code here
        int n = arr.length + 1; // Since one number is missing
        long expectedSum = (long) n * (n + 1) / 2;

        long actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        return (int) (expectedSum - actualSum);
    }
}

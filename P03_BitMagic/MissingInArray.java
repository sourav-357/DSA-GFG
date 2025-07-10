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

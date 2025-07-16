// Given an array arr of positive integers. You have to return the maximum of j - i such that arr[i] < arr[j] and i < j.

public class maximumIndex {
    int maxIndexDiff(int[] arr) {
        int n = arr.length;
        if (n == 1) {
            return 0;
        }
        int maxDiff = -1;
        int[] LMin = new int[n];
        int[] RMax = new int[n];

        LMin[0] = arr[0];
        for (int i = 1; i < n; ++i)
            LMin[i] = Math.min(arr[i], LMin[i - 1]);

        RMax[n - 1] = arr[n - 1];
        for (int j = n - 2; j >= 0; --j)
            RMax[j] = Math.max(arr[j], RMax[j + 1]);

        int i = 0, j = 0;
        while (i < n && j < n) {
            if (LMin[i] <= RMax[j]) {
                maxDiff = Math.max(maxDiff, j - i);
                j++;
            } else {
                i++;
            }
        }
        return maxDiff;
    }
}

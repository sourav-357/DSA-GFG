// Given an array arr[] with non-negative integers representing the height of blocks. If the width of each block is 1, compute how much water can be trapped between the blocks during the rainy season. 

package P05_Array;

public class MaximumTrappedWater {
    public int maxWater(int[] arr) {
        int n = arr.length;
        if (n == 0)
            return 0;

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        // Step 1: Fill leftMax[]
        leftMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
        }

        // Step 2: Fill rightMax[]
        rightMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
        }

        // Step 3: Calculate total trapped water
        int trapped = 0;
        for (int i = 0; i < n; i++) {
            int waterAtI = Math.min(leftMax[i], rightMax[i]) - arr[i];
            if (waterAtI > 0)
                trapped += waterAtI;
        }

        return trapped;
    }
}
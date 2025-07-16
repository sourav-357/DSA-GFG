package P05_Array;
// In a restaurant, two waiters, A and B, receive n orders per day, earning tips as per arrays arr[i] and brr[i] respectively. If A takes the ith order, the tip is arr[i] rupees; if B takes it, the tip is brr[i] rupees.

// To maximize total tips, they must distribute the orders such that:

// A can handle at most x orders
// B can handle at most y orders
// Given that x + y ≥ n, all orders can be managed by either A or B. Return the maximum possible total tip after processing all the orders.

import java.util.Arrays;

public class MAximumTipCalculator {
    public static long maxTip(int n, int x, int y, int[] arr, int[] brr) {

        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++)
            indices[i] = i;

        Arrays.sort(indices, (i, j) -> Math.abs(arr[j] - brr[j]) - Math.abs(arr[i] - brr[i]));

        long totalTips = 0;

        for (int idx : indices) {
            if ((arr[idx] >= brr[idx] && x > 0) || y == 0) {
                totalTips += arr[idx];
                x--;
            } else {
                totalTips += brr[idx];
                y--;
            }
        }

        return totalTips;
    }
}

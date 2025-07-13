// Given a array arr of integers, return the sums of all subsets in the list.  Return the sums in any order.

package P04_Recursion;

import java.util.ArrayList;

public class SubsetSum {
    public ArrayList<Integer> subsetSums(int[] arr) {
        ArrayList<Integer> sums = new ArrayList<>();
        dfs(0, 0, arr, sums); // start at index 0 with running‑sum 0
        return sums; // sums now holds 2^n values
    }

    // depth‑first enumeration of subsets
    private void dfs(int idx, int runningSum, int[] arr, ArrayList<Integer> sums) {
        if (idx == arr.length) { // hit the end → record the sum
            sums.add(runningSum);
            return;
        }

        // Decision 1: include arr[idx]
        dfs(idx + 1, runningSum + arr[idx], arr, sums);

        // Decision 2: exclude arr[idx]
        dfs(idx + 1, runningSum, arr, sums);
    }
}

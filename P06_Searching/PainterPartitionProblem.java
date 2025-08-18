package P06_Searching;

import java.util.*;

class PainterPartitionProblem {

    // checks whether all boards can be painted within 'maxTime'
    // by dividing the work among at most k painters
    boolean isPossible(int maxTime, int[] arr, int k) {
        int painters = 1;
        int currSum = 0;

        for (int length : arr) {
            // if a board is longer than maxTime,
            // it's impossible to assign
            if (length > maxTime)
                return false;
            // if assigning this board exceeds maxTime, 
            // give it to a new painter
            if (currSum + length > maxTime) {
                painters++;
                currSum = length;
            } 
            // otherwise, continue adding to the current 
            // painter's workload
            else {
                currSum += length;
            }
        }
        // return true if total painters used is
        // within the allowed k
        return painters <= k;
    }
    // returns the minimum possible time to paint all 
    // boards using exactly k painters
    int minTime(int[] arr, int k) {
        int low = Arrays.stream(arr).max().getAsInt();
        int high = Arrays.stream(arr).sum();
        int result = high;

        while (low <= high) {
            int mid = (low + high) / 2;

            // if this time allows us to paint
            // with k painters or fewer
            if (isPossible(mid, arr, k)) {
                result = mid;
                high = mid - 1;
            } 
            // if not possible, we need to allow 
            // more time
            else {
                low = mid + 1;
            }
        }

        return result;
    }
}
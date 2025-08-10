package P06_Searching;

public class PairInSortedArray {
    
}
class Solution {
    int countPairs(int arr[], int target) {
        int count = 0;
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                int leftVal = arr[left];
                int rightVal = arr[right];

                if (leftVal == rightVal) {
                    int n = right - left + 1;
                    count += (n * (n - 1)) / 2;  // nC2 combinations
                    break;
                } else {
                    int countLeft = 1;
                    int countRight = 1;

                    while (left + 1 < right && arr[left + 1] == leftVal) {
                        countLeft++;
                        left++;
                    }

                    while (right - 1 > left && arr[right - 1] == rightVal) {
                        countRight++;
                        right--;
                    }

                    count += countLeft * countRight;
                    left++;
                    right--;
                }
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return count;
    }
}

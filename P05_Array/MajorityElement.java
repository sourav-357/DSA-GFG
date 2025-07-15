// Given an array arr[]. Find the majority element in the array. If no majority element exists, return -1.
// Note: A majority element in an array is an element that appears strictly more than arr.size()/2 times in the array.

package P05_Array;

public class MajorityElement {
    int majorityElement(int arr[]) {
        int n = arr.length;
        int count = 0;
        int candidate = -1;

        for (int num : arr) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > n / 2) {
            return candidate;
        } else {
            return -1;
        }
    }
}

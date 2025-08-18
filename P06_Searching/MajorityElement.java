/*
Given an array arr[]. Find the majority element in the array. If no majority element exists, return -1.

Note: A majority element in an array is an element that appears strictly more than arr.size()/2 times in the array.
*/

package P06_Searching;

class MajorityElement {
    int majorityElement(int arr[]) {
        
        int res = 0, count = 1;
        for (int i = 0; i < arr.length; i++) {
            
            // Check if the element is repeating or not 
            if (arr[i] == arr[res]) {
                count++;
            } else {
                count--;
            }
            
            // If the count comes out to be Zero
            if (count == 0) {
                res = i;
                count = 1;
            }
        }
        
        // Now Checking out if the element is really a majoity or not
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[res]) {
                count++;
            }
        }
        if (count <= arr.length/2) {
            return -1;
        } else {
            return arr[res];
        }
    }
}
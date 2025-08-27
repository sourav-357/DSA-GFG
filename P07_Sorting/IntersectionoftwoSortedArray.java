/*
Given two sorted arrays arr1[] and arr2[]. Your task is to return the intersection of both arrays.
Intersection of two arrays is said to be elements that are common in both arrays. The intersection should not count duplicate elements.
Note: If there is no intersection then return an empty array.
*/

package P07_Sorting;

import java.util.ArrayList;

class IntersectionoftwoSortedArray {
    public ArrayList<Integer> intersection(int arr1[], int arr2[]) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        int n = arr1.length, m = arr2.length;

        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                
                if (result.isEmpty() || result.get(result.size() - 1) != arr1[i]) {
                    result.add(arr1[i]);
                }
                i++;
                j++;
            }
        }
        return result;
    }
}

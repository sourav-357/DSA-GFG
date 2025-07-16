package P05_Array;
// Given two sorted arrays a[] and b[], where each array may contain duplicate elements , the task is to return the elements in the union of the two arrays in sorted order.

// Union of two arrays can be defined as the set containing distinct common elements that are present in either of the arrays.

import java.util.ArrayList;

public class UnionOf2SoretedArray {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        int n = a.length, m = b.length;

        while (i < n && j < m) {

            int last = result.isEmpty() ? Integer.MIN_VALUE : result.get(result.size() - 1);

            if (a[i] < b[j]) {
                if (a[i] != last) {
                    result.add(a[i]);
                }
                i++;
            } else if (a[i] > b[j]) {
                if (b[j] != last) {
                    result.add(b[j]);
                }
                j++;
            } else {
                if (a[i] != last) {
                    result.add(a[i]);
                }
                i++;
                j++;
            }
        }

        while (i < n) {
            int last = result.isEmpty() ? Integer.MIN_VALUE : result.get(result.size() - 1);
            if (a[i] != last) {
                result.add(a[i]);
            }
            i++;
        }

        while (j < m) {
            int last = result.isEmpty() ? Integer.MIN_VALUE : result.get(result.size() - 1);
            if (b[j] != last) {
                result.add(b[j]);
            }
            j++;
        }

        return result;
    }
}

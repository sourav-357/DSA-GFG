package P07_Sorting;

import java.util.ArrayList;

class UnionOf2sortedArray {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        int n = a.length, m = b.length;

        while (i < n && j < m) {
            
            while (i > 0 && i < n && a[i] == a[i - 1]) i++;
            
            while (j > 0 && j < m && b[j] == b[j - 1]) j++;

            if (i >= n || j >= m) break;

            if (a[i] < b[j]) {
                result.add(a[i]);
                i++;
            } else if (a[i] > b[j]) {
                result.add(b[j]);
                j++;
            } else {
                result.add(a[i]);
                i++;
                j++;
            }
        }

        while (i < n) {
            if (i == 0 || a[i] != a[i - 1])
                result.add(a[i]);
            i++;
        }

        while (j < m) {
            if (j == 0 || b[j] != b[j - 1])
                result.add(b[j]);
            j++;
        }

        return result;
    }
}

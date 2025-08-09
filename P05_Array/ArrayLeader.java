package P05_Array;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeader {
    
}
class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        
        int n = arr.length;
        int maxFromRight = arr[n - 1];
        
        result.add(maxFromRight);
        
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                result.add(arr[i]);
                maxFromRight = arr[i];
            }
        }
        
        Collections.reverse(result);
        
        return result;
    }
}

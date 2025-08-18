package P06_Searching;

public class AllowcateMinimumPages {
    
}
class Solution {
    public int findPages(int[] arr, int k) {
        // code here
        // if number of students are more than total books
        // then allocation is not possible
        if(k > arr.length)
            return -1;
        
        // search space for Binary Search
        int n = arr.length-1;
        int lo = 0;
        int hi = 0;
        for(int i = 0; i <= n; i++) {
            hi += arr[i];
            if (lo < arr[i]) {
                lo = arr[i];
            }
        }
        int res = -1;
        
        while(lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            
            if(check(arr, k, mid)){
                res = mid;
                hi = mid - 1;
            }
            else {
                lo = mid + 1;
            }
        }
        return res;
    }
    boolean check(int[] arr, int k, int pageLimit) {
        
        // starting from the first student
        int cnt = 1;
        int pageSum = 0;
        for(int i = 0; i < arr.length; i++) {
            
            // if adding the current book exceeds the page 
            // limit, assign the book to the next student
            if(pageSum + arr[i] > pageLimit) {
                cnt++;
                pageSum = arr[i];
            }
            else {
                pageSum += arr[i];
            }
        }
        
        // if books can assigned to less than k students then
        // it can be assigned to exactly k students as well
        return (cnt <= k);
    }
}
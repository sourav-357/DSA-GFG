package P06_Searching;

public class AggressiveCows {
    
}
class Solution {
    public int aggressiveCows(int[] stalls, int k) {

        int low = 1;
        int high = stalls[stalls.length - 1] - stalls[0];
        int mid = 0;
        int ans = 0;
        
        while(low <= high) {
            mid = (low + high) / 2;
            if(check(stalls, k, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    } 
    boolean check(int[] stalls, int k, int mid) {
        int count = 1;
        int lastPos = stalls[0];
        
        for(int i = 1; i < stalls.length; i++) {
            if(stalls[i] - lastPos >= mid) {
                count++;
                lastPos = stalls[i];
            }
        }
        return (count >= k);
    }
}
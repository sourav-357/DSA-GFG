package ProblemOfTheDay;

class MinimumJump {
    public int minJumps(int[] arr) {
        int n = arr.length;
        
        // Edge case: single element (already at end)
        if (n <= 1) return 0;
        
        // If first element is 0, we can't move
        if (arr[0] == 0) return -1;
        
        int jumps = 0;
        int currEnd = 0;   // Current range of jump
        int farthest = 0;  // Farthest index we can go
        
        for (int i = 0; i < n - 1; i++) {
            farthest = Math.max(farthest, i + arr[i]);
            
            // If we have reached the end of current jump
            if (i == currEnd) {
                jumps++;
                currEnd = farthest;
                
                // If we can't move further
                if (currEnd <= i) return -1;
                
                // If we can already reach end
                if (currEnd >= n - 1) return jumps;
            }
        }
        
        return -1;  // If end not reachable
    }
}

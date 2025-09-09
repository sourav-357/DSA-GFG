package ProblemOfTheDay;

import java.util.*;

class AssignMiceHoles {
    public int assignHole(int[] mices, int[] holes) {
        Arrays.sort(mices);
        Arrays.sort(holes);
        
        int maxTime = 0;
        
        for (int i = 0; i < mices.length; i++) {
            maxTime = Math.max(maxTime, Math.abs(mices[i] - holes[i]));
        }
        
        return maxTime;
    }
}

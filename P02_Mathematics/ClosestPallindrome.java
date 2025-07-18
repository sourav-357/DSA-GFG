// Given a number num, our task is to find the closest Palindrome number whose absolute difference with the given number is minimal. If 2 Palindrome numbers have the same absolute difference as the given number, take the smaller one.

package P02_Mathematics;

import java.util.ArrayList;

public class ClosestPallindrome {
    public long closestPalindrome(long num) {
        
        String s = String.valueOf(num);
        int len = s.length();

        if (num < 10) return num;

        long prefix = Long.parseLong(s.substring(0, (len + 1) / 2));
        ArrayList<Long> candidates = new ArrayList<>();

        for (int i = -1; i <= 1; i++) {
            String newPrefix = String.valueOf(prefix + i);
            StringBuilder sb = new StringBuilder(newPrefix);
            if (len % 2 == 0) {
                candidates.add(Long.parseLong(newPrefix + sb.reverse().toString()));
            } else {
                candidates.add(Long.parseLong(newPrefix + sb.deleteCharAt(sb.length() - 1).reverse().toString()));
            }
        }

        candidates.add((long)Math.pow(10, len - 1) - 1); 
        candidates.add((long)Math.pow(10, len) + 1);     

        long closest = -1;
        long minDiff = Long.MAX_VALUE;

        for (long cand : candidates) {
            long diff = Math.abs(cand - num);
            if (diff < minDiff || (diff == minDiff && cand < closest)) {
                closest = cand;
                minDiff = diff;
            }
        }

        return closest;
    }
}

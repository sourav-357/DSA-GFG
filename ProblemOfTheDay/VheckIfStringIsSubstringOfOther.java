/*
Given two strings s1 and s2. You have to check that s1 is a subsequence of s2 or not.
Note: A subsequence is a sequence that can be derived from another sequence 
by deleting some elements without changing the order of the remaining elements. 
*/

package ProblemOfTheDay;

class VheckIfStringIsSubstringOfOther {
    public boolean isSubSeq(String s1, String s2) {
        int i = 0, j = 0;

        while (i < s1.length() && j < s2.length()) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == s1.length();
    }
}

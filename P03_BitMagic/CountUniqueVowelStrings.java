// You are given a lowercase string s, determine the total number of distinct strings that can be formed using the following rules:

// Identify all unique vowels (a, e, i, o, u) present in the string.
// For each distinct vowel, choose exactly one of its occurrences from s. If a vowel appears multiple times, each occurrence represents a unique selection choice.
// Generate all possible permutations of the selected vowels. Each unique arrangement counts as a distinct string.
// Return the total number of such distinct strings.

package P03_BitMagic;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountUniqueVowelStrings {
    public int vowelCount(String s) {

        Map<Character, Integer> vowelMap = new HashMap<>();
        Set<Character> vowelsSet = Set.of('a', 'e', 'i', 'o', 'u');

        for (char c : s.toCharArray()) {
            if (vowelsSet.contains(c)) {
                vowelMap.put(c, vowelMap.getOrDefault(c, 0) + 1);
            }
        }

        int k = vowelMap.size();
        if (k == 0)
            return 0;

        long totalChoices = 1;
        for (int count : vowelMap.values()) {
            totalChoices *= count;
        }

        long permutations = factorial(k);

        return (int) (totalChoices * permutations);
    }

    private long factorial(int n) {
        long res = 1;
        for (int i = 2; i <= n; i++)
            res *= i;
        return res;
    }
}

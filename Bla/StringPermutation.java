// Given a string S. The task is to find all permutations (need not be different) of a given string.

package Bla;

import java.util.ArrayList;
import java.util.Collections;

public class StringPermutation {
    public ArrayList<String> permutation(String S) {
        ArrayList<String> result = new ArrayList<>();
        char[] chars = S.toCharArray();
        permute(chars, 0, result);
        Collections.sort(result);
        return result;
    }

    private void permute(char[] chars, int index, ArrayList<String> result) {
        if (index == chars.length) {
            result.add(new String(chars));
            return;
        }

        for (int i = index; i < chars.length; i++) {
            swap(chars, i, index);
            permute(chars, index + 1, result);
            swap(chars, i, index);
        }
    }

    private void swap(char[] chars, int i, int j) {
        char tmp = chars[i];
        chars[i] = chars[j];
        chars[j] = tmp;
    }
}

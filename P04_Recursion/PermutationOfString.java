// Given a string s, which may contain duplicate characters, your task is to generate and return an array of all unique permutations of the string. You can return your answer in any order.

package P04_Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class PermutationOfString {
    public ArrayList<String> findPermutation(String s) {
        ArrayList<String> result = new ArrayList<>();
        if (s == null || s.length() == 0)
            return result;

        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        boolean[] visited = new boolean[chars.length];

        backtrack(chars, new StringBuilder(), visited, result);
        return result;
    }

    private void backtrack(char[] chars, StringBuilder path, boolean[] visited, ArrayList<String> result) {
        if (path.length() == chars.length) {
            result.add(path.toString());
            return;
        }

        for (int i = 0; i < chars.length; i++) {
            if (visited[i])
                continue;

            if (i > 0 && chars[i] == chars[i - 1] && !visited[i - 1])
                continue;

            visited[i] = true;
            path.append(chars[i]);
            backtrack(chars, path, visited, result);
            path.deleteCharAt(path.length() - 1);
            visited[i] = false;
        }
    }
}
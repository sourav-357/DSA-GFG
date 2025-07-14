// You are given a two-dimensional mat[][] of size n*m containing English alphabets and a string word. Check if the word exists on the mat. The word can be constructed by using letters from adjacent cells, either horizontally or vertically. The same cell cannot be used more than once.

package Bla;

public class WordSearch {
    static public boolean isWordExist(char[][] mat, String word) {
        int n = mat.length;
        int m = mat[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == word.charAt(0)) {
                    if (dfs(mat, word, i, j, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean dfs(char[][] mat, String word, int i, int j, int index) {
        if (index == word.length()) {
            return true;
        }
        if (i < 0 ||
                j < 0 ||
                i >= mat.length ||
                j >= mat[0].length ||
                mat[i][j] != word.charAt(index)) {
            return false;
        }
        char temp = mat[i][j];
        mat[i][j] = '#';

        boolean found = dfs(mat, word, i + 1, j, index + 1) ||
                dfs(mat, word, i - 1, j, index + 1) ||
                dfs(mat, word, i, j + 1, index + 1) ||
                dfs(mat, word, i, j - 1, index + 1);

        mat[i][j] = temp;

        return found;
    }
}

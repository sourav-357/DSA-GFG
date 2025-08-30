package ProblemOfTheDay;

import java.util.Stack;

class TheCelibrityProblem {
    public int celebrity(int mat[][]) {
        int n = mat.length;
        Stack<Integer> stack = new Stack<>();

        // Step 1: Push all people into stack
        for (int i = 0; i < n; i++) {
            stack.push(i);
        }

        // Step 2: Find potential celebrity
        while (stack.size() > 1) {
            int a = stack.pop();
            int b = stack.pop();

            // If a knows b, then a cannot be celebrity, push b back
            if (mat[a][b] == 1) {
                stack.push(b);
            } else {
                // If a does not know b, then b cannot be celebrity, push a back
                stack.push(a);
            }
        }

        // Potential celebrity
        int candidate = stack.pop();

        // Step 3: Verify candidate
        for (int i = 0; i < n; i++) {
            if (i != candidate) {
                // Celebrity should not know anyone and everyone should know celebrity
                if (mat[candidate][i] == 1 || mat[i][candidate] == 0) {
                    return -1;
                }
            }
        }

        return candidate;
    }
}
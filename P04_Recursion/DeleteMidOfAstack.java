// Given a stack s, delete the middle element of the stack without using any additional data structure.
// Middle element:- floor((size_of_stack+1)/2) (1-based indexing) from the bottom of the stack.
// Note: The output shown by the compiler is the stack from top to bottom.

package P04_Recursion;

import java.util.Stack;

public class DeleteMidOfAstack {
    public void deleteMid(Stack<Integer> s) {
        int size = s.size();
        deleteHelper(s, 0, size);
    }

    private void deleteHelper(Stack<Integer> s, int current, int size) {

        if (current == size / 2) {
            s.pop();
            return;
        }
        int top = s.pop();

        deleteHelper(s, current + 1, size);
        s.push(top);
    }
}

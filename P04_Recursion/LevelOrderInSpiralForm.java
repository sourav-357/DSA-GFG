package P04_Recursion;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;

// Define your own Node class for binary tree
class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class LevelOrderInSpiralForm {
    public ArrayList<Integer> findSpiral(Node root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null)
            return res;

        Deque<Node> dq = new ArrayDeque<>();
        dq.add(root);

        boolean evenLevel = true; // level 0 is even → print R→L
        while (!dq.isEmpty()) {
            int size = dq.size();
            ArrayList<Integer> level = new ArrayList<>(size);

            // normal left‑to‑right dequeue to collect nodes of this level
            for (int i = 0; i < size; i++) {
                Node cur = dq.pollFirst();
                level.add(cur.data);
                if (cur.left != null)
                    dq.addLast(cur.left);
                if (cur.right != null)
                    dq.addLast(cur.right);
            }

            // for even levels we need right→left, so just reverse
            if (evenLevel)
                Collections.reverse(level);

            res.addAll(level);
            evenLevel = !evenLevel; // flip direction for next level
        }
        return res;
    }
}

package ProblemOfTheDay;

import java.util.Deque;

class RotateDequesByK {
    public static void rotateDeque(Deque<Integer> dq, int type, int k) {
        // If the deque is empty, no rotation is needed.
        if (dq.isEmpty()) {
            return;
        }
        
        // Get the actual number of rotations needed (k mod size of deque)
        int size = dq.size();
        k = k % size;
        
        // If the rotation is greater than 0, proceed with the rotation
        if (k == 0) {
            return;  // No need to rotate if k is 0 after modulo operation
        }

        if (type == 1) {
            // Right rotation (Clockwise): Move the last element to the front
            for (int i = 0; i < k; i++) {
                dq.addFirst(dq.removeLast());  // Remove the last element and add it at the front
            }
        } else if (type == 2) {
            // Left rotation (Anti-clockwise): Move the first element to the back
            for (int i = 0; i < k; i++) {
                dq.addLast(dq.removeFirst());  // Remove the first element and add it at the back
            }
        }
    }
}

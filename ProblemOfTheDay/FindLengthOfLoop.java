package ProblemOfTheDay;


class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}


class FindLengthOfLoop {
    public int lengthOfLoop(Node head) {
        if (head == null || head.next == null) return 0;

        Node slow = head, fast = head;

        // Step 1: Detect loop using Floyd's Cycle Detection
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // Loop detected
            if (slow == fast) {
                return countLoopLength(slow);
            }
        }
        return 0; // No loop
    }

    // Step 2: Count loop length
    private int countLoopLength(Node node) {
        int count = 1;
        Node temp = node.next;

        while (temp != node) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
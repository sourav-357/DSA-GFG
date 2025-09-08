package ProblemOfTheDay;

class MergeSortForLinkedList {
    // Main function to sort a linked list using Merge Sort
    public Node mergeSort(Node head) {
        // Base case: if head is null or only one element
        if (head == null || head.next == null) {
            return head;
        }

        // Step 1: Split the list into two halves
        Node middle = getMiddle(head);
        Node nextOfMiddle = middle.next;

        // Disconnect the first half from the second
        middle.next = null;

        // Step 2: Recursively sort both halves
        Node left = mergeSort(head);
        Node right = mergeSort(nextOfMiddle);

        // Step 3: Merge the sorted halves
        return sortedMerge(left, right);
    }

    // Utility function to merge two sorted linked lists
    private Node sortedMerge(Node a, Node b) {
        if (a == null) return b;
        if (b == null) return a;

        Node result;

        if (a.data <= b.data) {
            result = a;
            result.next = sortedMerge(a.next, b);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }

        return result;
    }

    // Utility function to find the middle of the linked list
    private Node getMiddle(Node head) {
        if (head == null) return head;

        Node slow = head;
        Node fast = head;

        // Move fast pointer by two and slow pointer by one
        // When fast reaches end, slow will be at middle
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}

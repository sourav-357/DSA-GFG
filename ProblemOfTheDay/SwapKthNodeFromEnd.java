package ProblemOfTheDay;

/* 
class SwapKthNodeFromEnd {
    public Node swapKth(Node head, int k) {
        if (head == null) return null;
        
        // Step 1: Count length of list
        int n = 0;
        // Node temp = head;
        while (temp != null) {
            n++;
            temp = temp.next;
        }
        
        // Step 2: If k is greater than length, return original
        if (k > n) return head;
        
        // Step 3: If kth node from start and end are same → no swap
        if (2 * k - 1 == n) return head;
        
        // Step 4: Find kth node from start (x) and its prev (x_prev)
        Node x_prev = null, x = head;
        for (int i = 1; i < k; i++) {
            x_prev = x;
            x = x.next;
        }
        
        // Step 5: Find kth node from end (y) and its prev (y_prev)
        Node y_prev = null, y = head;
        for (int i = 1; i < n - k + 1; i++) {
            y_prev = y;
            y = y.next;
        }
        
        // Step 6: Swap previous pointers
        if (x_prev != null) x_prev.next = y;
        if (y_prev != null) y_prev.next = x;
        
        // Step 7: Swap next pointers
        Node tempNext = x.next;
        x.next = y.next;
        y.next = tempNext;
        
        // Step 8: If swapping head, update it
        if (k == 1) head = y;
        if (k == n) head = x;
        
        return head;
    }
}
*/
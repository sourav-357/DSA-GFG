package ProblemOfTheDay;

/* 
class ReverseKgroup {
    public Node reverseKGroup(Node head, int k) {
        if (head == null || k <= 1) return head;

        Node dummy = new Node(0);
        dummy.next = head;
        Node groupPrev = dummy;

        while (true) {
            Node kth = getKthOrLast(groupPrev, k);
            if (kth == groupPrev) break; 

            Node groupNext = kth.next;

            Node prev = groupNext;
            Node curr = groupPrev.next;

            while (curr != groupNext) {
                Node temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }

            Node temp = groupPrev.next; 
            groupPrev.next = kth;       
            groupPrev = temp;            
        }

        return dummy.next;
    }

    private Node getKthOrLast(Node curr, int k) {
        int count = 0;
        while (curr.next != null && count < k) {
            curr = curr.next;
            count++;
        }
        return curr; 
    }
}
*/
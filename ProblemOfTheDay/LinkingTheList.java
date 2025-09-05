package ProblemOfTheDay;

/* 
class LinkingTheList {
    public Node segregate(Node head) {
        if (head == null || head.next == null) return head;

        // Step 1: Count number of 0s, 1s, and 2s
        int count0 = 0, count1 = 0, count2 = 0;
        Node curr = head;

        while (curr != null) {
            if (curr.data == 0) count0++;
            else if (curr.data == 1) count1++;
            else count2++;
            curr = curr.next;
        }

        // Step 2: Rewrite values in order (0s, then 1s, then 2s)
        curr = head;
        while (count0 > 0) {
            curr.data = 0;
            curr = curr.next;
            count0--;
        }
        while (count1 > 0) {
            curr.data = 1;
            curr = curr.next;
            count1--;
        }
        while (count2 > 0) {
            curr.data = 2;
            curr = curr.next;
            count2--;
        }

        return head;
    }
}
*/
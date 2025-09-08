
package ProblemOfTheDay;

import java.util.PriorityQueue;
import java.util.Comparator;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class Merge2SortedLinkedList {
    Node mergeKLists(Node[] arr) {
        // PriorityQueue to hold nodes based on their data value
        PriorityQueue<Node> pq = new PriorityQueue<>(new Comparator<Node>() {
            public int compare(Node a, Node b) {
                return a.data - b.data;
            }
        });

        // Add the head node of each list to the priority queue
        for (Node node : arr) {
            if (node != null) {
                pq.add(node);
            }
        }

        // Dummy node to simplify handling the result list
        Node dummy = new Node(0);
        Node tail = dummy;

        // Extract the smallest node and add its next node to the queue
        while (!pq.isEmpty()) {
            Node minNode = pq.poll();
            tail.next = minNode;
            tail = tail.next;

            if (minNode.next != null) {
                pq.add(minNode.next);
            }
        }

        return dummy.next;
    }
}

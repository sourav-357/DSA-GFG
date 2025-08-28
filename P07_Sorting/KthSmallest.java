package P07_Sorting;

import java.util.PriorityQueue;

class KthSmallest {
    public static int kthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : arr) {
            pq.add(num);
        }

        for (int i = 0; i < k - 1; i++) {
            pq.poll();
        }

        return pq.peek();
    }
}

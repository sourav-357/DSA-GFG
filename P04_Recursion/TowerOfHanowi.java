package P04_Recursion;

public class TowerOfHanowi {
    public int towerOfHanoi(int n, int from, int to, int aux) {
        // base case: one disk needs exactly one move
        if (n == 1)
            return 1;

        // moves to shift n‑1 disks to auxiliary +
        // 1 move for the largest disk +
        // moves to shift n‑1 disks to target
        return 2 * towerOfHanoi(n - 1, from, aux, to) + 1;
    }
}

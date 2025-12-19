
package P04_Recursion;

public class P06_TowerOfHanoi {
    int count = 0;
    public int towerOfHanoi(int n, int from, int to, int aux) {
        if (n == 1) {
            count++;
            return count;
        }
        towerOfHanoi(n - 1, from, to, aux);
        count++;
        towerOfHanoi(n - 1, aux, from, to);
        return count;
    }
}
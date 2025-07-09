// We have a horizontal number line. On that number line, we have gas stations at positions stations[0], stations[1], ..., stations[n-1], where n is the size of the stations array. Now, we add k more gas stations so that d, the maximum distance between adjacent gas stations, is minimized. We have to find the smallest possible value of d. Find the answer exactly to 2 decimal places.

package P02_Mathematics;

public class HardProgram1 {
    public static double findSmallestMaxDist(int stations[], int k) {
        int n = stations.length;
        double low = 0, high = 0;

        for (int i = 0; i < n - 1; i++) {
            high = Math.max(high, stations[i + 1] - stations[i]);
        }

        while (high - low > 1e-6) {
            double mid = (low + high) / 2.0;
            if (canPlace(stations, k, mid)) {
                high = mid;
            } else {
                low = mid;
            }
        }

        // Round to 2 decimal places
        return Math.round(high * 100.0) / 100.0;
    }

    private static boolean canPlace(int[] stations, int k, double dist) {
        int count = 0;
        for (int i = 0; i < stations.length - 1; i++) {
            double gap = stations[i + 1] - stations[i];
            count += (int) (gap / dist);
        }
        return count <= k;
    }
}

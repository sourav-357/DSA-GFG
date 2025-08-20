package P06_Searching;

class Count1InSortedArray {
    public int countOnes(int[] arr) {
        int low = 0, high = arr.length - 1;
        int lastOneIndex = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == 1) {
                lastOneIndex = mid;
                low = mid + 1; // Search on the right side
            } else {
                high = mid - 1; // Search on the left side
            }
        }

        return lastOneIndex + 1;
    }
}

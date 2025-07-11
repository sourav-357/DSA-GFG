package P03_BitMagic;
public class MissingNumberSuffledArray {
    public int findMissing(int[] arr1, int[] arr2) {
        // code here
        int xor = 0;

        for (int num : arr1)
            xor ^= num;
        for (int num : arr2)
            xor ^= num;

        return xor;
    }
}

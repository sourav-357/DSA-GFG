package P04_Recursion;

import java.util.HashSet;
import java.util.Set;

public class CountNumbersContainingSpecificDigits {
    public int countValid(int n, int[] arr) {
        Set<Integer> arrSet = new HashSet<>();
        for (int d : arr)
            arrSet.add(d);

        int total = 9 * (int) Math.pow(10, n - 1);
        Set<Integer> otherDigits = new HashSet<>();
        for (int i = 0; i <= 9; i++) {
            if (!arrSet.contains(i)) {
                otherDigits.add(i);
            }
        }
        if (otherDigits.isEmpty())
            return total;
        int countWithoutArrDigits = 0;

        for (int d : otherDigits) {
            if (d == 0)
                continue;
            countWithoutArrDigits += countCombinations(d, n - 1, otherDigits);
        }
        return total - countWithoutArrDigits;
    }

    private int countCombinations(int firstDigit, int remainingDigits, Set<Integer> allowedDigits) {
        int base = allowedDigits.size();
        return (int) Math.pow(base, remainingDigits);
    }
}

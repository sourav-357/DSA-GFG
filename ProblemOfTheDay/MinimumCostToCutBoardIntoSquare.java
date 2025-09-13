package ProblemOfTheDay;

import java.util.Arrays;
import java.util.Collections;

class MinimumCostToCutBoardIntoSquare {
    public static int minCost(int n, int m, int[] x, int[] y) {
        // Convert int[] to Integer[] for sorting in descending order
        Integer[] xCuts = Arrays.stream(x).boxed().toArray(Integer[]::new);
        Integer[] yCuts = Arrays.stream(y).boxed().toArray(Integer[]::new);

        Arrays.sort(xCuts, Collections.reverseOrder());
        Arrays.sort(yCuts, Collections.reverseOrder());

        int i = 0, j = 0;
        int horizontalPieces = 1, verticalPieces = 1;
        int cost = 0;

        while (i < xCuts.length && j < yCuts.length) {
            if (xCuts[i] > yCuts[j]) {
                cost += xCuts[i] * horizontalPieces;
                verticalPieces++;
                i++;
            } else {
                cost += yCuts[j] * verticalPieces;
                horizontalPieces++;
                j++;
            }
        }

        // Remaining vertical cuts
        while (i < xCuts.length) {
            cost += xCuts[i] * horizontalPieces;
            i++;
        }

        // Remaining horizontal cuts
        while (j < yCuts.length) {
            cost += yCuts[j] * verticalPieces;
            j++;
        }

        return cost;
    }
}

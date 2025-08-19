package P07_Sorting;

import java.util.*;

public class SortStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine()); // Read number of test cases

        for (int t = 0; t < T; t++) {
            String str = sc.nextLine();
            char[] chars = str.toCharArray();
            Arrays.sort(chars); // Sort the character array
            System.out.println(new String(chars)); // Convert back to string and print
        }
        sc.close();
    }
}

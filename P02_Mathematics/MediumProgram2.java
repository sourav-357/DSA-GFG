// Given two numbers as strings s1 and s2. Calculate their Product.
// Note: The numbers can be negative and You are not allowed to use any built-in function or convert the strings to integers. There can be zeros in the begining of the numbers. You don't need to specify '+' sign in the begining of positive numbers.

package P02_Mathematics;

public class MediumProgram2 {
    public String multiplyStrings(String s1, String s2) {
        // Step 1: Handle sign
        boolean isNegative = false;
        if (s1.charAt(0) == '-') {
            isNegative = !isNegative;
            s1 = s1.substring(1);
        }
        if (s2.charAt(0) == '-') {
            isNegative = !isNegative;
            s2 = s2.substring(1);
        }

        // Step 2: Remove leading zeros
        s1 = removeLeadingZeros(s1);
        s2 = removeLeadingZeros(s2);

        if (s1.equals("0") || s2.equals("0"))
            return "0";

        // Step 3: Multiply like grade-school
        int m = s1.length(), n = s2.length();
        int[] result = new int[m + n];

        for (int i = m - 1; i >= 0; i--) {
            int digit1 = s1.charAt(i) - '0';
            for (int j = n - 1; j >= 0; j--) {
                int digit2 = s2.charAt(j) - '0';
                int pos1 = i + j, pos2 = i + j + 1;
                int mul = digit1 * digit2 + result[pos2];

                result[pos2] = mul % 10;
                result[pos1] += mul / 10;
            }
        }

        // Step 4: Build the result string
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < result.length && result[i] == 0)
            i++; // skip leading zeros
        while (i < result.length)
            sb.append(result[i++]);

        // Step 5: Apply sign
        if (isNegative)
            sb.insert(0, '-');

        return sb.toString();
    }

    private String removeLeadingZeros(String s) {
        int i = 0;
        while (i < s.length() && s.charAt(i) == '0')
            i++;
        return i == s.length() ? "0" : s.substring(i);
    }
}

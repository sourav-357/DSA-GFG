public class IsCompliment {
    static String onesComplement(String S, int N) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < N; i++) {
            char bit = S.charAt(i);
            result.append(bit == '0' ? '1' : '0');
        }

        return result.toString();
    }
}

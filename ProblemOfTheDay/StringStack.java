package ProblemOfTheDay;

class StringStack {
    public boolean stringStack(String pat, String tar) {
        int i = pat.length() - 1;
        int j = tar.length() - 1;
        int skip = 0;

        while (i >= 0) {
            if (skip > 0) {
                skip--;
            } else if (j >= 0 && pat.charAt(i) == tar.charAt(j)) {
                j--;
            } else {
                skip++;
            }
            i--;
        }
        return j < 0;
    }
}
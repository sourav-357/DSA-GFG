package ProblemOfTheDay;

class LargestNumberInOneSwap {
    public String largestSwap(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        // Store last occurrence of each digit
        int[] lastIndex = new int[10];
        for (int i = 0; i < n; i++) {
            lastIndex[arr[i] - '0'] = i;
        }

        // Traverse the string
        for (int i = 0; i < n; i++) {
            // check for larger digit (from '9' to current+1)
            for (char ch = '9'; ch > arr[i]; ch--) {
                if (lastIndex[ch - '0'] > i) {
                    // swap
                    int j = lastIndex[ch - '0'];
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    return new String(arr);
                }
            }
        }

        return s; // no swap needed
    }
}


package ProblemOfTheDay;

import java.util.Stack;

class DecodeTheString {
    static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int currentNum = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                currentNum = currentNum * 10 + (c - '0');
            } else if (c == '[') {
                countStack.push(currentNum);
                stringStack.push(currentString);
                currentString = new StringBuilder();
                currentNum = 0;
            } else if (c == ']') {
                int repeatTimes = countStack.pop();
                StringBuilder prevString = stringStack.pop();
                for (int i = 0; i < repeatTimes; i++) {
                    prevString.append(currentString);
                }
                currentString = prevString;
            } else {
                currentString.append(c);
            }
        }

        return currentString.toString();
    }
}

import java.util.Stack;

public class Solution {
    public String decodeString(String s) {

        String answer = "";
        Stack<Integer> countStack = new Stack<>();
        Stack<String> resStack = new Stack<>();
        int i = 0;

        if (Character.isDigit(s.charAt(i)) && s.length() == 1) {
            return answer;
        }

        while (i < s.length()) {
            if (Character.isDigit(s.charAt(i))) {
                int count = 0;
                while (Character.isDigit(s.charAt(i))) {
                    count = 10 * count + (s.charAt(i) - '0');
                    i++;
                }
                countStack.push(count);
            } else if (s.charAt(i) == '[') {
                resStack.push(answer);
                answer = "";
                i++;
            } else if (s.charAt(i) == ']') {
                StringBuilder temp = new StringBuilder(resStack.pop());
                int repeatTimes = countStack.pop();
                for (int j = 0; j < repeatTimes; j++) {
                    temp.append(answer);
                }
                answer = temp.toString();
                i++;
            } else {
                answer += s.charAt(i++);
            }
        }
        return answer;
    }
}
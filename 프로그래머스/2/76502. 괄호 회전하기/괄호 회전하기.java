import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            String str = s.substring(i, length) + s.substring(0, i);
            Stack<Character> stack = new Stack<>();
            
            for (int j = 0; j < length; j++) {
                char c = str.charAt(j);

                if (c == '[' || c == '(' || c == '{') {
                    stack.push(c);
                    continue;
                }
                if (c == ']') {
                    if (stack.isEmpty()) {
                        stack.push(c);
                        break;
                    }
                    if (stack.peek() == '[') {
                        stack.pop();
                        continue;
                    }
                }
                if (c == '}') {
                    if (stack.isEmpty()) {
                        stack.push(c);
                        break;
                    }
                    if (stack.peek() == '{') {
                        stack.pop();
                        continue;
                    }
                }
                if (c == ')') {
                    if (stack.isEmpty()) {
                        stack.push(c);
                        break;
                    }
                    if (stack.peek() == '(') {
                        stack.pop();
                    }
                }
            }
            if (stack.isEmpty()) {
                answer++;
            }
        }
        return answer;
    }
}
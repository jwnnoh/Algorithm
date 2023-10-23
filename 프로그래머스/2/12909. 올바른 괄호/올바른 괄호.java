import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i< s.length(); i++) {
            if (stack.isEmpty()) {
                if (s.charAt(i) == '(') {
                    stack.push(s.charAt(i));
                    continue;
                    
                }
                else {
                    answer = false;
                    return answer;
                }
                
            }
            
            if (s.charAt(i) == ')') {
                stack.pop();
                continue;
            }
            stack.push(s.charAt(i));
        }
        
        if (!stack.isEmpty()) {
            answer = false;
        }
        
        return answer;
    }
}
import java.util.*;

class Solution
{
    public int solution(String s)
    {
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();   
    
        for (int i=0;i<arr.length;i++) {
            char c = arr[i];
            
            if (stack.isEmpty()) {
                stack.push(c);
                continue;
            }
            if (stack.peek() == c) {
                stack.pop();
                continue;
            }
            stack.push(c);
        }
        
        if (stack.isEmpty()) {
            return 1;
        }
        return 0;
    }
}
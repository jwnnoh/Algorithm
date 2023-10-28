import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        String tmp = Integer.toString(n, 3);
        String reverse = "";
        
        for (int i = tmp.length()-1; i >= 0; i--) {
            reverse += tmp.charAt(i);
        }
        answer = Integer.parseInt(reverse, 3);    
        return answer;
    }
}
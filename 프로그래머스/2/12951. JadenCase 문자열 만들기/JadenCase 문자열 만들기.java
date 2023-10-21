import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                if (s.charAt(i) - '0' >= 0 && s.charAt(i) - '9' <= 0) {
                    answer += s.charAt(i);
                } else {
                    answer += (char) (s.charAt(i) - 32);
                }
                continue;
            }
            if (s.charAt(i-1) == ' ' && s.charAt(i) != ' ') {
                if (s.charAt(i) - '0' >= 0 && s.charAt(i) - '9' <= 0) {
                    answer += s.charAt(i);
                } else {
                    answer += (char) (s.charAt(i) - 32);
                }
                continue;
            }
            answer += s.charAt(i);
        }
        return answer;
    }
}
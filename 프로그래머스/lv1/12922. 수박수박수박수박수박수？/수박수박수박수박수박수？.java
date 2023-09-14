import java.util.*;

class Solution {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        
        if (n == 1) {
            answer.append("수");
        }
        else if (n%2 == 1) {
            for(int i = 0; i <n/2; i++) {
                answer.append("수박");
            }
            answer.append("수");
        }
        else {
            for(int i = 0; i <n/2; i++) {
                answer.append("수박");
            }
        }
        return String.valueOf(answer);
    }
}
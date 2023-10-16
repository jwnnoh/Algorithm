import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        int[] x = new int[10];
        int[] y = new int[10];
        
        for (int i = 0; i < X.length(); i++) {
            x[X.charAt(i) - '0']++;
        }
        for (int i = 0; i < Y.length(); i++) {
            y[Y.charAt(i) - '0']++;
        }
        
        for (int i = 9; i >= 0; i--) {
            int min = Math.min(x[i], y[i]);
            
            if (String.valueOf(answer).equals("") && i ==0 && x[i] > 1 && y[i] > 1) {
                answer.append("0");
                return String.valueOf(answer);
            }
            
            for (int j = 0; j < min; j++) {
                answer.append(i);
            }
        }
        
        if (String.valueOf(answer).equals("")) {
            answer.append("-1");
        }
        return String.valueOf(answer);
    }
}
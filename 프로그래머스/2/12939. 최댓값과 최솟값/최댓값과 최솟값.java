import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for (String i : arr) {
            int tmp = Integer.parseInt(i);
            System.out.println(tmp);
            if (tmp > max) {
                max = Math.max(max, tmp);
            }
            if (tmp < min) {
                min = Math.min(min, tmp);
            }
        }
        answer = min + " " + max;
        return answer;
    }
}
import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        char[] arr = new char[s.length()];
        
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        
        Arrays.sort(arr);
        
        for (int i = s.length()-1; i >= 0; i--) {
            sb.append(arr[i]);
        }
        String answer = String.valueOf(sb);
        return answer;
    }
}
import java.util.*;

class Solution {
    public long solution(long n) {
        StringBuilder sb = new StringBuilder();
        long answer = 0;
        
        String s = String.valueOf(n);
        int[] arr = new int[s.length()];
        
        for(int i = 0; i <s.length(); i++) {
            arr[i] = s.charAt(i) - '0';
        }
        
        Arrays.sort(arr);
        
        for(int i = arr.length-1; i>=0; i--) {
            sb.append(arr[i]);
        }
        answer = Long.parseLong(String.valueOf(sb));
        return answer;
    }
}
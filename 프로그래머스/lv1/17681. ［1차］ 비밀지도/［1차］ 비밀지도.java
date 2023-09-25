import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i=0; i<n; i++) {
            String tmp = Integer.toBinaryString(arr1[i] | arr2[i]);
            tmp = tmp.replace("0", " ");
            tmp = tmp.replace("1", "#");
            int limit = n - tmp.length();
            for(int j = 0; j < limit; j++) {
                tmp = ' ' + tmp;
            }
            answer[i] = tmp;
        }
        return answer;
    }
}
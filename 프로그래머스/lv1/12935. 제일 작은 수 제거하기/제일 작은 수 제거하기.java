import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        if (arr.length == 1) {
            answer = new int[1];
            answer[0] = -1;
            return answer;
        } 
        else {
            answer = new int[arr.length-1];
        }
        
        int min = Integer.MAX_VALUE;
        for(int i : arr) {
            min = Math.min(min, i);
        }
        
        int cnt = 0;
        for(int i : arr) {
            if (i != min) {
                answer[cnt] = i;
                cnt++;
            }
        }
        return answer;
    }
}
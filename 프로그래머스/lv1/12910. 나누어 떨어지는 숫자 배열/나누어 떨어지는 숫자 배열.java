import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int cnt = 0;
        
        for(int i : arr) {
            if (i % divisor == 0) {
                cnt++;
            }
        }
        
        if(cnt == 0) {
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        
        answer = new int[cnt];
        
        int tmp = 0;
        for(int j : arr){
            if(j % divisor == 0){
                answer[tmp] = j;
                tmp++;
            }
        }
        
        Arrays.sort(answer);
        return answer;
    }
}
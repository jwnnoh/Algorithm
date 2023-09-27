import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        int[] sub;
        int start = 0, end = 0;
        for (int i = 0; i < commands.length; i++) {
            end = commands[i][1] - 1;
            start = commands[i][0] - 1; 
            sub = new int[end - start + 1]; 
            
            int count = 0;
            for (int j = start; j <= end; j++) {
                sub[count] = array[j];
                count++;
            }
            
            Arrays.sort(sub);
            answer[i] = sub[commands[i][2] - 1];
        }
        return answer;
    }
}
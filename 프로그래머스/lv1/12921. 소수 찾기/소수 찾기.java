import java.util.*;

class Solution {
    static boolean[] arr;

    public int solution(int n) {
        int answer = 0;
        
        arr = new boolean[n+1];
        prime();
        
        for (boolean b : arr) {
            if (!b) {
                answer++;
            }
        }
        return answer;
    }
    
    static public void prime() {
        arr[0] = arr[1] = true;
        
        for (int i = 2; i <= Math.sqrt(arr.length); i++) {
            if (arr[i]) {
                continue;
            }
            
            for (int j = i*i; j < arr.length; j += i) {
                arr[j] = true;
            }
        }
    }
}
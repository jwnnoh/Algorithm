import java.util.*;

class Solution {
    public double solution(int[] arr) {
        
        double count = 0;
        for(double d : arr) {
            count += d;
        }
        
        double answer = count / arr.length;
        return answer;
    }
}
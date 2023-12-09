import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = n;
        int tmp = Integer.bitCount(n);
        
        while (tmp != Integer.bitCount(++answer));
        
        return answer;
    }
}
import java.util.*;

class Solution {
    public long solution(long price, long money, long count) {
        long answer = -1;
        
        for (int i=1; i <=count; i++) {
            money -= (price*i);
        }
        
        if (money >= 0) {
            return 0;
        } else {
            answer = (long) (Math.abs(money));
        }
        return answer;
    }
}
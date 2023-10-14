import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        HashSet<String> hashset = new HashSet<>(4);
        hashset.add("aya");
        hashset.add("ye");
        hashset.add("woo");
        hashset.add("ma");

        for (String s : babbling) {
            
            boolean tmpFlag = false;
            boolean flag = true;
            String tmp = "";
            String pre = "";
            
            for (int i = 0; i < s.length(); i++) {
                tmp += s.charAt(i);
                
                if(hashset.contains(tmp) && !(tmp.equals(pre))) {
                    pre = tmp;
                    tmp = "";
                    flag = true;
                    continue;
                }
                flag = false;
            }
            if (flag) {
                answer++;
            }
        }
        return answer;
    }
}
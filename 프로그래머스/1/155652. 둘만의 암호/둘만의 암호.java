import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        
        // List<Integer> list = new ArrayList<>();
        // for (int i = 0; i < skip.length(); i++) {
        //     list.add(skip.charAt(i) + 0);
        // }
        
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            int tmp = s.charAt(i);
            
            while (count < index) { //97~122
                tmp++;
                
                if (tmp > 122) {
                    tmp -= 26;
                }
                if (skip.contains(String.valueOf((char) tmp))) {
                    continue;
                }
                count++;
            }
            answer.append((char) tmp);
        }
        return answer.toString();
    }
}
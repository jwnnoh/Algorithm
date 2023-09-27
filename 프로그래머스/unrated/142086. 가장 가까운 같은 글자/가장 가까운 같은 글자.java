import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        HashMap<Character, Integer> hashmap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!hashmap.containsKey(s.charAt(i))) {
                hashmap.put(s.charAt(i), i);
                answer[i] = -1;
            }
            else {
                answer[i] = i - hashmap.get(s.charAt(i));
                hashmap.put(s.charAt(i), i);
            }
        }
        return answer;
    }
}
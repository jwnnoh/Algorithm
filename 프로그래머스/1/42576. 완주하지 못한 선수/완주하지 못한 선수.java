import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> hashmap = new HashMap<>();
        for (String s : participant) {
            if (hashmap.containsKey(s)) {
                hashmap.put(s, hashmap.get(s) + 1);
            }
            else {
                hashmap.put(s, 1);
            }
        }
        
        for (String s : completion) {
            hashmap.put(s, hashmap.get(s) - 1);
        }
        
        for (String key : hashmap.keySet()) {
            if (hashmap.get(key) == 1) {
                answer = key;
                break;
            }
        }
        return answer;
    }
}
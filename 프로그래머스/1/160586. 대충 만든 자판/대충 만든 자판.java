import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int[] key = new int[26];
        Arrays.fill(key, Integer.MAX_VALUE);
        
        for (String s : keymap) { //알파벳 키맵 저장
            for (int i = 0; i < s.length(); i++) {
                int keyIndex = (s.charAt(i) - 65);
                if (i < key[keyIndex]) {
                    key[keyIndex] = i+1;
                }
            }
         }
        
        for (int i = 0; i < targets.length; i++) {
            String tmp = targets[i];
            
            for (char c : tmp.toCharArray()) {
                if (key[c-65] == Integer.MAX_VALUE) {
                    answer[i] = -1;
                    break;
                }
                else {
                    answer[i] += key[c-65];
                }
            }
        }
        return answer;
    }
}
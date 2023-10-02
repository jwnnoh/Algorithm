import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> tmp = new ArrayList<>();
        
        for (int i = 0; i < score.length; i++) {
            if (tmp.size() < k) {
                tmp.add(score[i]);
                Collections.sort(tmp);
                answer[i] = tmp.get(0);
                continue;
            }
            
            if (tmp.size() == k) {
                if (score[i] > tmp.get(0)) {
                    tmp.set(0, score[i]);
                    Collections.sort(tmp);
                }
                answer[i] = tmp.get(0);
            }
        }
        return answer;
    }
}
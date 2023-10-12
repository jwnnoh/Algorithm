import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];

        HashMap<Integer, Double> hashmap = new HashMap<>(N);

        for (int i = 0; i < N; i++) {
            double pass = 0;
            double remain = 0;
            for (int j = 0; j < stages.length; j++) {
                if (stages[j] >= i+1) {
                    pass++;
                    if (stages[j] == i+1) {
                        remain++;
                    }
                }
            }
            if (pass == 0) {
                pass = 1;
            }
            hashmap.put(i+1, (remain/pass));
        }

        for (int i = 0; i < N; i++) {
            double max = -1;
            int index = 0;
            for (int key :
                    hashmap.keySet()) {
                if (hashmap.get(key) > max) {
                    max = hashmap.get(key);
                    index = key;
                }
            }
            answer[i] = index;
            hashmap.remove(index);
        }
        
        return answer;
    }
}
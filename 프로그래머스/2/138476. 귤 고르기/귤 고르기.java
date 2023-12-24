import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int sum = 0;
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i : tangerine) {
            if (!map.containsKey(i)) {
                map.put(i, 0);
            }
            map.replace(i, map.get(i) + 1);
        }
        
        ArrayList<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list, Collections.reverseOrder());
        
        for (int i : list) {
            if (sum + i >= k) {
                answer++;
                break;
            } else {
                sum += i;
                answer++;
            }
        }
        return answer;
    }
}
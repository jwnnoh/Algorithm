import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> hashset = new HashSet<>();
        
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                hashset.add(numbers[i]+numbers[j]);
            }
        }
        int[] answer = new int[hashset.size()];
        
        int cnt = 0;
        for (int i : hashset) {
            answer[cnt] = i;
            cnt++;
        }
        Arrays.sort(answer);
        
        return answer;
    }
}
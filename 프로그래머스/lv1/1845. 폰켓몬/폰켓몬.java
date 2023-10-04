import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int size = nums.length / 2;
        HashSet<Integer> hashset = new HashSet<>();
        
        for (int i : nums) {
            if (!hashset.contains(i)) {
                hashset.add(i);
            }
        }
        
        if (hashset.size() > size) {
            answer = size;
        } else {
            answer = hashset.size();
        }
        
        return answer;
    }
}
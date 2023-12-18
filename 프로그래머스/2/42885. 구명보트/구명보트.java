import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;   
        Arrays.sort(people);
        
        int value = people.length - 1;
        int tmp = 0;
        while (value >= tmp) {
            if (people[value] + people[tmp] <= limit)
                tmp++;
            answer++;
            value--;
        }
        return answer;
    }
}
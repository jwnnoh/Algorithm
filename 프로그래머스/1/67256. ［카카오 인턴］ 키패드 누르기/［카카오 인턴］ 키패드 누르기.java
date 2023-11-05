import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        int left = 10;
        int right = 12;
        
        for (int i : numbers) {
            if (i == 1 || i == 4 || i == 7) {
                left = i;
                answer.append("L");
                continue;
            }
            if (i == 3 || i == 6 || i == 9) {
                right = i;
                answer.append("R");
                continue;
            }
            if (i == 2 || i == 5 || i == 8 || i == 0) {
                if (i == 0) {
                    i = 11;
                }
                int leftDistance = 
                    (Math.abs(i - left) / 3) + (Math.abs(i - left) % 3);
                int rightDistance = 
                    (Math.abs(i - right) / 3) + (Math.abs(i - right) % 3);
                if (leftDistance == rightDistance) {
                    if (hand.equals("left")) {
                        left = i;
                        answer.append("L");
                        continue;
                    }
                    right = i;
                    answer.append("R");
                    continue;
                }
                if (leftDistance < rightDistance) {
                    left = i;
                    answer.append("L");
                    continue;
                }
                right = i;
                answer.append("R");
            }
        }
        return answer.toString();
    }
}
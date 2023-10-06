import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] answers) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int sumA = 0, sumB = 0, sumC = 0;
        for (int i = 0; i < answers.length; i++) {
            int indexA = i % 5;
            int indexB = i % 8;
            int indexC = i % 10; 
            
            if (answers[i] == a[indexA]) {
                sumA++;
            }
            if (answers[i] == b[indexB]) {
                sumB++;
            }
            if (answers[i] == c[indexC]) {
                sumC++;
            }
        }
        
        int max = Math.max(sumA, Math.max(sumB, sumC));
        if (max == sumA) {
            answer.add(1);
        }
        if (max == sumB) {
            answer.add(2);
        }
        if (max == sumC) {
            answer.add(3);
        }
        return answer;
    }
}
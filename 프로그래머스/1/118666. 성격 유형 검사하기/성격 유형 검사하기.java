import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        Map<Character, Integer> mbti = new HashMap<>();
        for (char ch : "RTCFJMAN".toCharArray()) {
            mbti.put(ch, 0);
        }
        
        for (int i = 0; i < survey.length; i++) {
            int choice = choices[i];
            char disagree = survey[i].charAt(0);
            char agree = survey[i].charAt(1);
            
            if (choice <= 3) { // 비동의
                mbti.replace(disagree, mbti.get(disagree) + 4 - choice);
                continue;
            }
            if (choice >= 5) { // 동의
                mbti.replace(agree, mbti.get(agree) + choice - 4);
            }
        }
        
        if (mbti.get('R') >= mbti.get('T')) {
            answer += 'R';
        } else {answer += 'T';}
        if (mbti.get('C') >= mbti.get('F')) {
            answer += 'C';
        } else {answer += 'F';}
        if (mbti.get('J') >= mbti.get('M')) {
            answer += 'J';
        } else {answer += 'M';}
        if (mbti.get('A') >= mbti.get('N')) {
            answer += 'A';
        } else {answer += 'N';}

        return answer;
    }
}
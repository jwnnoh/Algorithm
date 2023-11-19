import java.util.*;

class Solution {
    public List<Integer> solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();
        Map<String, Integer> term = new HashMap<>();
        for (String s : terms) {
            String[] tmp = s.split(" ");
            term.put(tmp[0], Integer.parseInt(tmp[1]));
        }
        
        int date = getDate(today);
        for (int i = 0; i < privacies.length; i++) {
            String[] privacy = privacies[i].split(" ");
            
            if (getDate(privacy[0]) + (term.get(privacy[1]) * 28) <= date) {
                answer.add(i + 1);
            }
        }
        return answer;
    }
    
    public int getDate(String today) {
        String[] date = today.split("\\.");
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);
        return (year * 12 * 28) + (month * 28) + day;
    }
}
class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if (s.length() == 4) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) - 'A' >= 0) {
                    answer = false;
                    break;
                }
            }
        }
        
        else if (s.length() == 6) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) - 'A' >= 0) {
                    answer = false;
                    break;
                }
            }
        }
        
        else {
            answer = false;
        }
        
        return answer;
    }
}
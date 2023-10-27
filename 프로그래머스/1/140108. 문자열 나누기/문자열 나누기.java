class Solution {
    public int solution(String s) {
        int answer = 0;
        int isfirst = 0;
        int notfirst = 0;
        char first = s.charAt(0);
        boolean flag = false;
        
        for (char c : s.toCharArray()) {
            if (flag) {
                first = c;
                flag = false;
            }
            if (c == first) {
                isfirst++;
            }
            else {
                notfirst++;
            }
            
            if (isfirst == notfirst) {
                answer++;
                isfirst = 0;
                notfirst = 0;
                flag = true;
            }
        }
        
        if (isfirst != 0) {
            answer++;
        }
        
        return answer;
    }
}
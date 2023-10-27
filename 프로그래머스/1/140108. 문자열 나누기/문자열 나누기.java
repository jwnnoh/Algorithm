class Solution {
    public int solution(String s) {
        int answer = 0;
        int isfirst = 0;
        int notfirst = 0;
        char first = s.charAt(0);
        boolean flag = false;
        
        for (int i = 0; i < s.length(); i++) {
            if(flag) {
                first = s.charAt(i);
                flag = false;
            }
            
            if (s.charAt(i) == first) {
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
class Solution {
    public long solution(int a, int b) {
        long answer = a + b;
        if(a == b) {
            return a;
        }
        
        if (a < b) {
            for(int i = a+1; i < b; i++) {
                answer += i;
            }
        }
        
        else {
            for(int i = b+1; i < a; i++) {
                answer += i;
            }
        }
        return answer;
    }
}
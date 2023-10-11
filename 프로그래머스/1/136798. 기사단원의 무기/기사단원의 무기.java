class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for (int i = 1; i <= number; i++) {
            int tmp = solve(i);
            
            if (tmp <= limit) {
                answer += tmp;
            }
            else {
                answer += power;
            }
        }
        return answer;
    }
             
    public int solve(int num) {
        int value = 1;
        if (num == 1) {
            return 1;
        }
        for (int i = 1; i <= num/2; i++) {
            if (num % i == 0) {
                value++;
            }
        }
        return value;
    } 
}
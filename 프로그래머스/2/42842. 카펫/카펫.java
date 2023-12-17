class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int sum = brown + yellow;
        
        for (int i = 3; i < sum; i++) {
            int tmp = sum / i;
            
            if (sum % i == 0 && tmp >= 3) {
                int row = Math.max(i, tmp);
                int col = Math.min(i, tmp);
                
                if ((col - 2) * (row - 2) == yellow) {
                    answer[0] = row;
                    answer[1] = col;
                    return answer;
                }
            }
        }
        return answer;
    }
}
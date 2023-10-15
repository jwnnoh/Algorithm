class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int win = 0;
        int fail = 0;
        
        for (int i : lottos) {
            if (i == 0) {
                fail++;
                continue;
            }
            for (int j : win_nums) {
                if (i == j) {
                    win++;
                    break;
                }
            }
        }
        
        if (win + fail > 1) {
            answer[0] = 7 - (win + fail);
        } else {
            answer[0] = 6;
        }
        
        if (win > 1) {
            answer[1] = 7 - win;
        } else {
            answer[1] = 6;
        }
        
        return answer;
    }
}
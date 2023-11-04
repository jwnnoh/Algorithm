import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        
        for (int i : moves) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[j][i-1] > 0) {
                    int tmp = board[j][i-1];
                    board[j][i-1] = 0;
                    if (!stack.isEmpty() && stack.peek() == tmp) {
                        stack.pop();
                        answer += 2;
                        break;
                    }
                    stack.push(tmp);
                    break;
                }
            }
        }
        return answer;
    }
}
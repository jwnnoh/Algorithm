import java.util.*;

class Solution {
    public int solution(String[][] board, int h, int w) {
        int length = board.length;
        int answer = 0;
        int[] dy = {-1, 0, 1, 0}; 
        int[] dx = {0, 1, 0, -1};
        
        for(int i =0; i<4; i++) {
            int ny = h + dy[i];
            int nx = w + dx[i];
            if(ny >= 0 && ny < length && nx >= 0 && nx < length) {
                if(board[h][w].equals(board[ny][nx])) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
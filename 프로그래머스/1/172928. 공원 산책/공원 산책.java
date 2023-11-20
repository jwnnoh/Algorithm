import java.util.*;
import java.awt.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[][] arr = new int[park.length][park[0].length()];
        int[] dy = {-1, 0, 1, 0};
        int[] dx = {0, 1, 0, -1};
        int[] answer = new int[2];

        for (int i = 0; i < park.length; i++) {
            String s = park[i];
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c == 'S') {
                    answer[0] = i; // y
                    answer[1] = j; // x
                }
                if (c == 'X') {
                    arr[i][j] = 1;
                }
            }
        }

        for (String route : routes) {
            boolean flag = true;
            char direction = route.charAt(0);
            int weight = Integer.parseInt(String.valueOf(route.charAt(2)));
            int[] tmp = answer.clone();
            int y = 0;
            int x = 0;

            for (int i = 0; i < weight; i ++) {
                switch (direction) {
                    case 'N':
                        y = tmp[0] + dy[0];
                        x = tmp[1] + dx[0];
                        break;
                    case 'E':
                        y = tmp[0] + dy[1];
                        x = tmp[1] + dx[1];
                        break;
                    case 'S':
                        y = tmp[0] + dy[2];
                        x = tmp[1] + dx[2];
                        break;
                    case 'W':
                        y = tmp[0] + dy[3];
                        x = tmp[1] + dx[3];
                        break;
                    default:
                        continue;
                }

                if (y < 0 || y >= park.length || x < 0 || x >= park[0].length() || arr[y][x] != 0) {
                    flag = false;
                    break;
                }

                tmp[0] = y;
                tmp[1] = x;
            }
            if (flag) {
                answer[0] = tmp[0];
                answer[1] = tmp[1];
            }
        }
        return answer;
    }
}
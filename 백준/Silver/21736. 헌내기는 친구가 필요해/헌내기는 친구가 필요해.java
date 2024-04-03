import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int answer = 0;

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        char[][] arr = new char[n][m];
        boolean[][] visited = new boolean[n][m];
        Queue<Point> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = s.charAt(j);
                if (arr[i][j] == 'I') {
                    visited[i][j] = true;
                    queue.add(new Point(i, j));
                }
            }
        }

        int[] dy = {-1, 0, 1, 0};
        int[] dx = {0, 1, 0, -1};

        while (!queue.isEmpty()) {
            Point now = queue.poll();

            for (int i = 0; i < 4; i++) {
                int ny = now.x + dy[i];
                int nx = now.y + dx[i];

                if (ny < 0 || ny >= n || nx < 0 || nx >= m) {
                    continue;
                }

                if (visited[ny][nx] || arr[ny][nx] == 'X') {
                    continue;
                }

                visited[ny][nx] = true;
                queue.add(new Point(ny, nx));
                if (arr[ny][nx] == 'P') {
                    answer+=1;
                }
            }
        }

        if (answer == 0) {
            System.out.println("TT");
        } else {
            System.out.println(answer);
        }
    }
}
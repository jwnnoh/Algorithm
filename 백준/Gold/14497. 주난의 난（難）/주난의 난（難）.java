import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][k];
        boolean[][] visited = new boolean[n][k];

        st = new StringTokenizer(br.readLine());

        int x1 = Integer.parseInt(st.nextToken()) - 1;
        int y1 = Integer.parseInt(st.nextToken()) - 1;
        int x2 = Integer.parseInt(st.nextToken()) - 1;
        int y2 = Integer.parseInt(st.nextToken()) - 1;

        Point start = new Point(x1, y1);
        Point end = new Point(x2, y2);

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < k; j++) {
                if (s.charAt(j) == '#') {
                    arr[i][j] = -1;
                    continue;
                }
                if (s.charAt(j) == '*') {
                    visited[i][j] = true;
                    continue;
                }
                arr[i][j] = Integer.parseInt(String.valueOf(s.charAt(j)));
            }
        }

        Queue<Point> queue = new LinkedList<>();

        int[] dy = {-1, 0, 1, 0};
        int[] dx = {0, 1, 0, -1};
        int count = 1;
        while (arr[end.x][end.y] != 0) {
            queue.add(new Point(start));
            while (!queue.isEmpty()) {
                Point now = new Point(queue.poll());

                for (int i = 0; i < 4; i++) {
                    int ny = now.x + dy[i];
                    int nx = now.y + dx[i];

                    if (ny < 0 || nx < 0 || ny >= n || nx >= k || visited[ny][nx]) {
                        continue;
                    }
                    if (arr[ny][nx] != 0) {
                        arr[ny][nx] = 0;
                        visited[ny][nx] = true;
                    } else {
                        queue.add(new Point(ny, nx));
                        visited[ny][nx] = true;
                    }
                    if (arr[end.x][end.y] == 0) {
                        System.out.println(count);
                        return;
                    }
                }
            }
            count++;
            visited = new boolean[n][k];
            visited[start.x][start.y] = true;
        }
    }

}
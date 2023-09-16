import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static Queue<Point> queue = new LinkedList<>();
    static int[][] arr, check;
    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};
    static int ny, nx, n, m;


    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        check = new int[n][m];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = s.charAt(j) - '0';
            }
        }

        check[0][0] = 1;
        queue.offer(new Point(0, 0));
        while (!queue.isEmpty()) {
            Point p = queue.poll();
            int y = p.x;
            int x = p.y;
            for (int i = 0; i < 4; i++) {
                ny = y + dy[i];
                nx = x + dx[i];


                if (ny < 0 || ny >= n || nx < 0 || nx >= m || arr[ny][nx] == 0) {
                    continue;
                }
                if (check[ny][nx] != 0) {
                    continue;
                }

                check[ny][nx] = check[y][x] + 1;
                queue.offer(new Point(ny, nx));
            }
        }

        System.out.println(check[n - 1][m - 1]);
    }

}
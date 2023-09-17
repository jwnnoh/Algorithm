import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static Queue<Point> queue = new LinkedList<>();

    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            boolean[][] arr = new boolean[m][n];
            boolean[][] check = new boolean[m][n];


            for (int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine());

                int tmpY = Integer.parseInt(st.nextToken());
                int tmpX = Integer.parseInt(st.nextToken());
                arr[tmpY][tmpX] = true;
            }

            int cnt = 0;
            int ny = 0, nx = 0, y = 0, x = 0;

            for (int j = 0; j < m; j++) {
                for (int l = 0; l < n; l++) {
                    if (arr[j][l]) {
                        if (!check[j][l]){
                            cnt++;

                            check[j][l] = true;

                            queue.offer(new Point(j, l));
                        }

                    }

                    while (!queue.isEmpty()) {
                        Point p = queue.poll();
                        y = p.x;
                        x = p.y;

                        for (int o = 0; o < 4; o++) {
                            ny = y + dy[o];
                            nx = x + dx[o];

                            if (ny < 0 || ny >= m || nx < 0 || nx >= n || !arr[ny][nx]) {
                                continue;
                            }
                            if (check[ny][nx]) {
                                continue;
                            }

                            check[ny][nx] = true;
                            queue.offer(new Point(ny, nx));
                        }
                    }
                }
            }

            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
    }

}
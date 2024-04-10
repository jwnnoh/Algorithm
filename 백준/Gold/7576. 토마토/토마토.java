import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;
    static Queue<Point> queue = new LinkedList<>();
    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int answer = Integer.MAX_VALUE;

        arr = new int[n][m];

        boolean flag = false;
        for (int i = 0; i < n; i++) {
            String[] temp = br.readLine().split(" ");
            for (int j = 0; j < temp.length; j++) {
                int value = Integer.parseInt(temp[j]);
                switch (value) {
                    case 1:
                        arr[i][j] = value;
                        queue.add(new Point(i, j));
                        break;
                    case 0:
                        arr[i][j] = value;
                        flag = true;
                        break;
                    case -1:
                        arr[i][j] = value;
                }
            }
        }

        if (!flag) {
            System.out.println(0);
            return;
        }

        while (!queue.isEmpty()) {
            Point now = queue.poll();

            for (int i = 0; i < 4; i++) {
                int ny = now.x + dy[i];
                int nx = now.y + dx[i];

                if (ny < 0 || nx < 0 || ny >= n || nx >= m) {
                    continue;
                }
                if (arr[ny][nx] != 0) {
                    continue;
                }
                queue.add(new Point(ny, nx));
                arr[ny][nx] = arr[now.x][now.y] + 1;
                answer = arr[now.x][now.y];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
            }
        }
        System.out.println(answer);
    }
}
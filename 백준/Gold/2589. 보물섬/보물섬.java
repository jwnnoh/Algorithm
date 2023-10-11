import java.awt.*;
import java.io.*;
import java.util.*;

public class Main {

    static int n, m, answer = -1;
    static char[][] arr;
    static int[][] check;
    static ArrayList<Point> land = new ArrayList<>();
    static Queue<Point> queue = new LinkedList<>();

    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new char[n][m];
        check = new int[n][m];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = s.charAt(j);
                if (arr[i][j] == 'L') {
                    land.add(new Point(i, j));
                }
            }
        }

        for (Point p :
                land) {
            check[p.x][p.y] = 1;
            queue.offer(new Point(p.x, p.y));
            solve(p.x, p.y);
            calc();
            check = new int[n][m];
        }

        System.out.println(answer-1);
    }

    public static void calc() {
        int tmp = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tmp = Math.max(tmp, check[i][j]);
            }
        }
        answer = Math.max(tmp, answer);
    }

    public static void solve(int y, int x) {
        while (!queue.isEmpty()) {
            Point point = queue.poll();

            for (int i = 0; i < 4; i++) {
                int ny = point.x + dy[i];
                int nx = point.y + dx[i];

                if (ny < 0 || ny >= n || nx < 0 || nx >= m || arr[ny][nx] == 'W') {
                    continue;
                }
                if (check[ny][nx] != 0) {
                    continue;
                }

                check[ny][nx] = check[point.x][point.y] + 1;
                queue.offer(new Point(ny, nx));
            }
        }
    }
}
import java.awt.*;
import java.io.*;
import java.util.*;

public class Main {

    static int r, c, answer = Integer.MAX_VALUE;
    static char[][] arr;
    static int[][] visited;
    static int[][] jhVisited;
    static Point jh, f;
    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};
    static boolean flag = false;
    static Queue<Point> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        arr = new char[r][c];
        visited = new int[r][c];
        for (int i = 0; i < r; i++) {
            Arrays.fill(visited[i], Integer.MAX_VALUE);
        }
        jhVisited = new int[r][c];



        for (int i = 0; i < r; i++) {
            String s = br.readLine();
            for (int j = 0; j < c; j++) {
                arr[i][j] = s.charAt(j);
                if (arr[i][j] == 'J') {
                    jh = new Point(i, j);
                }
                if (arr[i][j] == 'F') {
                    queue.offer(new Point(i, j));
                    visited[i][j] = 1;
                    flag = true;
                }
            }
        }
        
        solve();

        if (answer == Integer.MAX_VALUE) {
            System.out.println("IMPOSSIBLE");
        }
        else {
            System.out.println(answer);
        }
    }

    public static void solve() {
        // 불 이동
        while (!queue.isEmpty()) {
            Point p = queue.poll();
            int y = p.x;
            int x = p.y;

            for (int i = 0; i < 4; i++) {
                int ny = y + dy[i];
                int nx = x + dx[i];

                if (ny < 0 || nx < 0 || ny >= r || nx >= c) {
                    continue;
                }
                if (visited[ny][nx] != Integer.MAX_VALUE || arr[ny][nx] == '#') {
                    continue;
                }
                visited[ny][nx] = visited[y][x] + 1;
                queue.offer(new Point(ny, nx));
            }
        }

        //지훈 이동
        jhVisited[jh.x][jh.y] = 1;
        queue.add(jh);
        jhBfs();
    }

    private static void jhBfs() {
        while (!queue.isEmpty()) {
            Point p = queue.poll();
            int y = p.x;
            int x = p.y;

            if (y == r - 1 || x == c - 1 || y == 0 || x == 0) {
                answer = jhVisited[y][x];
                break;
            }

            for (int i = 0; i < 4; i++) {
                int ny = y + dy[i];
                int nx = x + dx[i];

                if (ny < 0 || nx < 0 || ny >= r || nx >= c) {
                    continue;
                }
                if (arr[ny][nx] == '#' || jhVisited[ny][nx] != 0) {
                    continue;
                }
                if (jhVisited[y][x] + 1 >= visited[ny][nx]) {
                    continue;
                }
                jhVisited[ny][nx] = jhVisited[y][x] + 1;
                queue.offer(new Point(ny, nx));
            }
        }
    }
}
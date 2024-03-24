import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int r, c, k, answer = 0;
    static char[][] arr;
    static boolean[][] visited;
    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        arr = new char[r][c];
        visited = new boolean[r][c];

        for (int i = 0; i < r; i++) {
            String s = br.readLine();
            for (int j = 0; j < c; j++) {
                if (s.charAt(j) == 'T') {
                    arr[i][j] = s.charAt(j);
                    visited[i][j] = true;
                }
            }
        }

        visited[r - 1][0] = true;
        go(r - 1, 0, 1);
        System.out.println(answer);
    }

    private static void go(int y, int x, int count) {
        if (count > k) {
            return;
        }
        if (y == 0 && x == c - 1 && count == k) {
            answer++;
        }

        for (int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];

            if (ny < 0 || nx < 0 || ny >= r || nx >= c || visited[ny][nx]) {
                continue;
            }
            visited[ny][nx] = true;
            go(ny, nx, count + 1);
            visited[ny][nx] = false;
        }
    }
}
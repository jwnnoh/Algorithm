import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};
    static char[][] arr;
    static Set<Character> set;
    static boolean[] visited;
    static Queue<Point> queue;
    static int answer, r, c;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        arr = new char[r][c];
        set = new HashSet<>();
        queue = new LinkedList<>();
        visited = new boolean[26];


        for (int i = 0; i < r; i++) {
            String s = br.readLine();
            for (int j = 0; j < c; j++) {
                arr[i][j] = s.charAt(j);
            }
        }

        answer = -1;
        visited[((int) arr[0][0]) - 'A'] = true;
        go(0, 0, 1);

        System.out.println(answer);
    }

    private static void go(int y, int x, int count) {
        answer = Math.max(answer, count);

        for (int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];

            if (ny < 0 || nx < 0 || ny >= r || nx >= c) {
                continue;
            }
            int next = (int) (arr[ny][nx] - 'A');

            if (!visited[next]) {
                visited[next] = true;
                go(ny, nx, count + 1);
                visited[next] = false;
            }
        }
    }
}
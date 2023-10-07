import java.awt.*;
import java.io.*;
import java.util.*;

public class Main {

    static int n, m, cnt, sum;
    static int[][] arr;
    static boolean[][] check;
    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};


    static ArrayList<Point> arrayList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        check = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        while (true) {
            check = new boolean[n][m];
            arrayList = new ArrayList<>();
            dfs(0, 0);

            sum = arrayList.size();
            for (Point p :
                    arrayList) {
                arr[p.x][p.y] = 0;
            }
            boolean flag = false;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (arr[i][j] == 1) {
                        flag = true;
                    }
                }
            }
            cnt++;
            if (!flag) {
                break;
            }
        }

        System.out.println(cnt + "\n" + sum);
    }

    public static void dfs(int y, int x) {
        check[y][x] = true;

        if (arr[y][x] == 1) {
            arrayList.add(new Point(y, x));
            return;
        }
        for (int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];

            if (ny < 0 || nx < 0 || ny >= n || nx >= m || check[ny][nx]) {
                continue;
            }
            dfs(ny, nx);
        }
    }
}
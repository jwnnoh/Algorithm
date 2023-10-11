import java.awt.*;
import java.io.*;
import java.util.*;

public class Main {

    static int n, l, r, answer = 0, sum = 0;
    static int[][] arr;
    static boolean[][] check;
    static ArrayList<Point> arrayList = new ArrayList<>();

    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        l = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());

        arr = new int[n][n];
        check = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        while (true) {
            boolean flag = false;
            check = new boolean[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (!check[i][j]) {
                        arrayList.clear();
                        check[i][j] = true;
                        arrayList.add(new Point(i, j));
                        sum = arr[i][j];
                        dfs(i, j);
                        if (arrayList.size() == 1) {
                            continue;
                        }
                        for (Point p :
                                arrayList) {
                            arr[p.x][p.y] = sum / arrayList.size();
                            flag = true;
                        }
                    }
                }
            }
            if (!flag) {
                System.out.println(answer);
                break;
            }
            answer++;
        }
    }

    public static void dfs(int y, int x) {
        for (int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];

            if (ny < 0 || nx < 0 || ny >= n || nx >= n || check[ny][nx]) {
                continue;
            }
            int tmp = Math.abs(arr[ny][nx] - arr[y][x]);
            if (tmp < l || tmp > r) {
                continue;
            }

            check[ny][nx] = true;
            arrayList.add(new Point(ny, nx));
            sum += arr[ny][nx];
            dfs(ny, nx);
        }
    }

}
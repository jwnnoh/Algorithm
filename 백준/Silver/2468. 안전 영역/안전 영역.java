import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int n, tmp, ny, nx, k;
    static int[][] arr;
    static boolean[][] check;

    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};


    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];


        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int cnt = 0;
        for (k = 0; k <= 100; k++) {
            check = new boolean[n][n];
            tmp = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (arr[i][j] > k && !check[i][j]) {
                        dfs(i, j);
                        tmp++;
                    }
                }
            }
            cnt = Math.max(cnt, tmp);
        }
        System.out.println(cnt);

    }

    public static void dfs(int y, int x) {
        check[y][x] = true;

        for (int i = 0; i < 4; i++) {
            ny = y + dy[i];
            nx = x + dx[i];

            if (ny < 0 || nx < 0 || ny >= n || nx >= n) {
                continue;
            }
            if (arr[ny][nx] > k && !check[ny][nx]) {
                dfs(ny, nx);
            }

        }
    }

}
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};
    static boolean[][] arr, check;
    static int ny, nx, y, x, cnt, m, n;


    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            arr = new boolean[m][n];
            check = new boolean[m][n];


            for (int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine());

                int tmpY = Integer.parseInt(st.nextToken());
                int tmpX = Integer.parseInt(st.nextToken());
                arr[tmpY][tmpX] = true;
            }

            cnt = 0;

            for (int j = 0; j < m; j++) {
                for (int l = 0; l < n; l++) {
                    if (arr[j][l]) {
                        if (!check[j][l]){
                            cnt++;
                            dfs(j, l);
                        }
                    }
                }
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
    }

    private static void dfs(int j, int l) {
        check[j][l] = true;
        for (int i = 0; i < 4; i++) {
            ny = j + dy[i];
            nx = l + dx[i];

            if (ny < 0 || ny >= m || nx < 0 || nx >= n) {
                continue;
            }
            if (!check[ny][nx] && arr[ny][nx]) {
                dfs(ny, nx);
            }
        }

    }

}
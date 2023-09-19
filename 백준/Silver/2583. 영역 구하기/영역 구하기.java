import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int m, n, ny, nx, total, tmp;
    static boolean[][] arr;
    static boolean[][] check;

    static ArrayList<Integer> arrayList = new ArrayList<>();

    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};


    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        arr = new boolean[m][n];
        check = new boolean[m][n];

        int k = Integer.parseInt(st.nextToken());

        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int y1 = Integer.parseInt(st.nextToken());
            int x1 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());

            for (int j = x1; j < x2; j++) {
                for (int l = y1; l < y2; l++) {
                    if (!check[j][l]) {
                        arr[j][l] = true;
                        check[j][l] = true;
                    }
                }
            }
        }

        check = new boolean[m][n];
        for (int j = 0; j < m; j++) {
            for (int l = 0; l < n; l++) {
                if (!check[j][l] && !arr[j][l]) {
                    tmp = 0;
                    dfs(j, l);
                    arrayList.add(tmp);
                    total++;
                }
            }
        }

        Collections.sort(arrayList);
        for (int i :
                arrayList) {
            sb.append(i).append(" ");
        }
        System.out.println(total);
        System.out.println(sb);

    }

    public static void dfs(int y, int x) {
        tmp++;
        check[y][x] = true;

        for (int i = 0; i < 4; i++) {
            ny = y + dy[i];
            nx = x + dx[i];

            if (ny < 0 || nx < 0 || ny >= m || nx >= n) {
                continue;
            }

            if (arr[ny][nx] || check[ny][nx]) {
                continue;
            }

            dfs(ny, nx);
        }
    }


}
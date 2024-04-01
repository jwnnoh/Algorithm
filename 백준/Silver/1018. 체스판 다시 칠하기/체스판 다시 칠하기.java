import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static boolean[][] arr;
    static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arr = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                if (s.charAt(j) == 'W') {
                    arr[i][j] = true;
                    continue;
                }
                arr[i][j] = false;
            }
        }

        int r = n - 7;
        int c = m - 7;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                go(i, j);
            }
        }
        System.out.println(answer);
    }

    private static void go(int y, int x) {
        int count = 0;
        boolean flag = arr[y][x];

        for (int i = y; i < y + 8; i++) {
            for (int j = x; j < x + 8; j++) {
                if (arr[i][j] != flag) {
                    count++;
                }

                flag = !flag;
            }
            flag = !flag;
        }
        count = Math.min(count, 64 - count);
        answer = Math.min(count, answer);
    }
}
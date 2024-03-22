import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n, m, h, answer = Integer.MAX_VALUE;
    static boolean[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());

        arr = new boolean[h + 2][n + 2];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a][b] = true;
        }
        go(1, 0);

        if (answer == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(answer);
        }

    }

    //
    private static void go(int index, int count) {
        if (count > 3 || count >= answer) {
            return;
        }
        if (check()) {
            answer = Math.min(count, answer);
            return;
        }
        for (int i = index; i <= h; i++) {
            for (int j = 1; j <= n; j++) {
                if (arr[i][j] || arr[i][j - 1] || arr[i][j + 1]) {
                    continue;
                }
                arr[i][j] = true;
                go(i, count + 1);
                arr[i][j] = false;
            }
        }

    }

    private static boolean check() {
        for (int i = 1; i <= n; i++) {
            int start = i;
            for (int j = 1; j <= h; j++) {
                if (arr[j][start]) {
                    start++;
                    continue;
                }
                if (arr[j][start - 1]) {
                    start--;
                }
            }
            if (start != i) {
                return false;
            }
        }
        return true;
    }
}
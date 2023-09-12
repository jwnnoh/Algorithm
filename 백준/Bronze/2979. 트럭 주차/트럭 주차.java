import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int a, b, c, sum;
    static boolean[][] arr = new boolean[3][101];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());


        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            for (int j = start; j < end; j++) {
                arr[i][j] = true;
            }
        }
        solve(a, b, c);
        System.out.println(sum);

    }

    public static void solve(int a, int b, int c) {
        for (int i = 1; i < 101; i++) {
            if (arr[0][i] && arr[1][i] && arr[2][i]) {
                sum += 3 * c;
            } else if ((arr[0][i] && arr[1][i]) || (arr[1][i] && arr[2][i]) || (arr[0][i] && arr[2][i])) {
                sum += 2 * b;
            } else if (arr[0][i] || arr[1][i] || arr[2][i]) {
                sum += a;
            }
        }
    }

}
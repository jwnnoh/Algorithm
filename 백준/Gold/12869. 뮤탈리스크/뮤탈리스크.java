import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[][] attackList = {{9, 3, 1}, {9, 1, 3}, {3, 9, 1}, {3, 1, 9}, {1, 9, 3}, {1, 3, 9}};
    static int[][][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[3];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

         dp = new int[arr[0] + 1][arr[1] + 1][arr[2] + 1];
        solve(new int[]{arr[0], arr[1], arr[2]});
        System.out.println(dp[0][0][0]);
    }

    public static void solve(int[] start) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(start);
        
        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            if (now[0] == 0 && now[1] == 0 && now[2] == 0) {
                return;
            }

            for (int i = 0; i < 6; i++) {
                int[] attack = attackList[i];
                int a = Math.max(now[0] - attack[0], 0);
                int b = Math.max(now[1] - attack[1], 0);
                int c = Math.max(now[2] - attack[2], 0);

                if (dp[a][b][c] == 0) {
                    queue.add(new int[]{a, b, c});
                    dp[a][b][c] = dp[now[0]][now[1]][now[2]] + 1;
                }
            }

        }
    }
}
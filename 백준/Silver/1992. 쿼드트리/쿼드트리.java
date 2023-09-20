import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int n, count;
    static int[][] arr;
    static boolean[][] check;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.charAt(j) - 48;
            }
        }

        solve(0, 0, n);
        System.out.println(sb);
    }

    public static void solve(int y, int x, int size) {
        if (isPossible(y, x, size)) {
            sb.append(arr[y][x]);
            return;
        }

        int nSize = size / 2;

        sb.append('(');
        solve(y, x, nSize);
        solve(y, x + nSize, nSize);
        solve(y + nSize, x, nSize);
        solve(y + nSize, x + nSize, nSize);
        sb.append(')');
    }

    public static boolean isPossible(int y, int x, int size) {
        int tmp = arr[y][x];

        for (int i = y; i < y + size; i++) {
            for (int j = x; j < x + size; j++) {
                if (tmp != arr[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
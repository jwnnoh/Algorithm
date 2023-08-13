import java.io.*;
import java.util.*;


public class Main {

    static long[][] array = new long[30][30];
    public static long bridge(int m, int n) {
        if (array[m][n] > 0) {
            return array[m][n];
        }
        if (m == n || n == 0) {
            return array[m][n] = 1;
        }
        return array[m][n] = bridge(m - 1, n - 1) + bridge(m - 1, n);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            sb.append(bridge(m, n)).append("\n");
        }
        System.out.println(sb);
    }
}
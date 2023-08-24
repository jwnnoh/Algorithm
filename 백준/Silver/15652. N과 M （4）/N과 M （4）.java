import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();

    static int[] arr;
    static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[m];

        ans(1, 0);

        System.out.println(sb);
    }

    private static void ans(int index, int depth) {
        if (depth == m) {
            for (int i :
                    arr) {
                sb.append(i).append(" ");
            }
            sb.append("\n");

            return;
        }

        for (int i = index; i <= n; i++) {
            arr[depth] = i;

            ans(i, depth + 1);
        }
    }

}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int a, b, c, sum;
    static int[] arr = new int[101];

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
                arr[j]++;
            }
        }
        solve(a, b, c);

    }

    public static void solve(int a, int b, int c) {
        for (int i = 1; i < 101; i++) {
            switch (arr[i]) {
                case 1:
                    sum += a;
                    break;
                case 2:
                    sum += 2 * b;
                    break;
                case 3:
                    sum += 3 * c;
                    break;
            }
        }
        System.out.println(sum);
    }

}
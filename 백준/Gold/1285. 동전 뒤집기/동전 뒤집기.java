import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int n;
    static int[] arr;
    static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n + 2];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            int value = 1;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'T') {
                    arr[i + 1] |= value;
                }
                value *= 2;
            }
        }

        go(1);
        System.out.println(answer);
    }

    private static void go(int index) {
        if (index == n + 1) {
            int sum = 0;
            for (int i = 1; i <= (1 << (n - 1)); i *= 2) {
                int cnt = 0;
                for (int j = 1; j <= n; j++) {
                    if ((arr[j] & i) != 0) {
                        cnt++;
                    }
                }
                sum += Math.min(cnt, n - cnt);
            }
            answer = Math.min(sum, answer);
            return;
        }
        go(index + 1);
        arr[index] = ~arr[index];
        go(index + 1);
    }
}
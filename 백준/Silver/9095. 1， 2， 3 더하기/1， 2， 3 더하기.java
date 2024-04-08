import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int[] arr;

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        arr = new int[11];
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            sb.append(go(n)).append("\n");
        }
        System.out.println(sb);
    }

    private static int go(int n) {
        if (arr[n] == 0) {
            for (int i = 1; i <= 3; i++) {
                arr[n] += go(n - i);
            }
        }
        return arr[n];
    }
}
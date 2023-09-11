import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static long[] arr = new long[101];

    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int j = 1; j <= 3; j++) {
            arr[j] = 1;
        }

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            n = Integer.parseInt(br.readLine());

            sb.append(solution(n)).append("\n");
        }
        System.out.println(sb);

    }

    public static long solution(int i) {
        if (arr[i] == 0) {
            arr[i] = solution(i - 2) + (solution(i-3));
            return arr[i];
        }
        else {
            return arr[i];
        }

    }

}
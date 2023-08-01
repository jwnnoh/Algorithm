import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[2000001];

        for (int i = 0; i < n; i++) {
            arr[Integer.parseInt(br.readLine())+1000000]++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                sb.append(i - 1000000).append("\n");
            }
        }
        System.out.println(sb);
    }
}
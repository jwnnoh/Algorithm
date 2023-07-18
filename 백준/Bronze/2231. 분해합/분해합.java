import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int total = 0;

        for (int i = 0; i < n; i++) {
            int tmp = i;
            int sum = 0;

            while (tmp != 0) {
                sum += tmp % 10;
                tmp /= 10;
                }

            if (i + sum == n) {
                total = i;
                break;
            }
        }
        bw.write(total + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}
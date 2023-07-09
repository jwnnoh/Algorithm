import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        int q = 25;
        int d = 10;
        int n = 5;
        int p = 1;

        for (int i = 0; i < t; i++) {
            int c = Integer.parseInt(br.readLine());

            bw.write(c/q + " ");
            c %= q;
            bw.write(c/d + " ");
            c %= d;
            bw.write(c/n + " ");
            c %= n;
            bw.write(c/p + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int tmp = Integer.MAX_VALUE;
        int count = 0;

        int limit = n / 3;
        for (int i = limit; i >= 0; i--) {
            for (int j = 0; j <= limit; j++) {
                int sum = (5 * i) + (3 * j);
                if (n == sum) {
                    if ((i + j) < tmp) {
                        tmp = (i + j);
                        bw.write((i+j) + "\n");
                        count++;
                    }
                }
            }
        }
        if (count == 0) {
            bw.write(-1 + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
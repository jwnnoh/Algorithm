import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        if (n == 1) {
            bw.write(" ");
        }
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                bw.write(i + "\n");
                n /= i;
                i--;
            }
        }


        bw.flush();
        br.close();
        bw.close();
    }
}
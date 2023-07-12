import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1) {
                break;
            }

            int count = 0;
            int append = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    count += i;
                    append++;
                }
            }

            if (count == n) {
                bw.write(n + " = ");
                int append2 = 0;
                for (int i = 1; i < n; i++) {
                    if (n % i == 0) {
                        append2++;
                        if (append2 == append) {
                            bw.write(i + "\n");
                        } else {
                            bw.write(i + " + ");
                        }
                    }
                }
            } else {
                bw.write(n + " is NOT perfect." + "\n");
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
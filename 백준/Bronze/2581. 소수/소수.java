import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        int min = 0;
        for (int i = n; i >= m; i--) {
            int count = 0;
            for (int j = 2; j <= i-1; j++) {
                if (i % j != 0) {
                    count++;
                }
            }
            if (count == i - 2) {
                sum += i;
                min = i;
            }
        }

        if (sum == 0) {
            bw.write(-1 + "\n");
        }else {
            bw.write(sum + "\n");
            bw.write(min + "\n");
        }


        bw.flush();
        br.close();
        bw.close();
    }
}
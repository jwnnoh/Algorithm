import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int total = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int count = 0;
            int a = Integer.parseInt(st.nextToken());

            for (int j = 1; j < a; j++) {
                if (a % j != 0) {
                    count++;
                }
            }
            if (count == a - 2) {
                total++;
            }
        }

        bw.write(total + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a1 = Long.parseLong(st.nextToken());
        long a0 = Long.parseLong(st.nextToken());
        long c = Long.parseLong(br.readLine());
        long n0 = Long.parseLong(br.readLine());

        if ((a1 * n0) + a0 <= c * n0 && c>=a1) {
            bw.write(1 + "\n");
        } else {
            bw.write(0 + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
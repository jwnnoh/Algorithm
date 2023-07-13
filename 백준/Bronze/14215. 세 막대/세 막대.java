import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int sum = a + b + c;

        int max = Math.max(a, b);
        max = Math.max(max, c);

        if (sum - max > max) {
            bw.write(sum + "\n");
        } else {
            max = sum - max - 1;
            bw.write(2 * max + 1 + "\n");
        }


        bw.flush();
        br.close();
        bw.close();
    }
}
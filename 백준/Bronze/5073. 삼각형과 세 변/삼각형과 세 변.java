import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int sum = a + b + c;
            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            int max = Math.max(b, a);
            if (c > max) max = c;

            if (a == b && b == c) {
                bw.write("Equilateral" + "\n");
            } else if (sum - max > max) {
                if (a == b || b == c || c == a) {
                    bw.write("Isosceles" + "\n");
                } else {
                    bw.write("Scalene" + "\n");
                }
            } else {
                bw.write("Invalid" + "\n");
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
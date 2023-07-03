import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] num = new int [n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        int max = num[0];
        int min = num[0];
        for (int i = 0; i < n; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (num[i] < min) {
                min = num[i];
            }
        }
        bw.write(min + " ");
        bw.write(max + " ");

        bw.flush();
        br.close();
        bw.close();
    }
}
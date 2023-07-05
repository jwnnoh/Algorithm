import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        int count = 0;
        for (int i = 0; i < n; i++) {
            int j = Integer.parseInt(String.valueOf(s.charAt(i)));
            count += j;
        }
        bw.write(count + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine())-1;

        int tmp = 0;
        int count = 0;
        while (tmp < n) {
            ++count;
            tmp += 6*count;
        }
        bw.write(count+1 + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}
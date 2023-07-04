import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int [31];

        for (int i = 1; i < 29; i++) {
            arr[Integer.parseInt(br.readLine())]++;
        }

        for (int i = 1; i < 31; i++) {
            if (arr[i] == 0) {
                bw.write(i + "\n");
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
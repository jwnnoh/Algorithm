import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = (Integer.parseInt(br.readLine()) % 42);
        }

        int cnt = 0;

        for (int i = 0; i < 10; i++) {
            int tmp = 0;
            for (int j = i+1; j < 10; j++) {
                if (arr[i] == arr[j]) {
                    tmp++;
                }
            }
            if (tmp == 0) {
                cnt++;
            }
        }
        bw.write(cnt + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}
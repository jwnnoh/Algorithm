import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int tmp = 0;
        int count = 0;
        while (tmp < n) {
            ++count;
            tmp += count;
        }

        int add = 0;
        for (int i = 0; i < count; i++) {
            add += i;
        }

        int ans = (n-add);
        int left = 0, right = 0;
        if ((count % 2) == 0) {
            for (int i = 0; i < ans; i++) {
                left = (i+1);
                right = (count-i);
            }
        } else {
            for (int i = 0; i < ans; i++) {
                left = (count-i);
                right = (i+1);
            }
        }
        bw.write(left + "/" + right);

        bw.flush();
        br.close();
        bw.close();
    }
}
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n+1];
        for (int i = 1; i < n+1; i++) {
            arr[i] = (i);
        }

        int m = Integer.parseInt(st.nextToken());
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for (int j = x; j <= (x + y) / 2; j++) {
                int tmp = arr[j];
                arr[j] = arr[x + y - j];
                arr[x + y - j] = tmp;

            }

        }

        for (int i = 1; i < arr.length; i++) {
            bw.write(arr[i] + " ");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
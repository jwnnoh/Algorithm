import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int [][] arr = new int[100][100];
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int j = x-1; j < x + 9; j++) {
                for (int k = y-1; k < y + 9; k++) {
                    arr[j][k]++;
                }
            }
        }

        int  count = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (arr[i][j] == 0) {
                   count++;
                }
            }
        }

        bw.write((100*100)-count + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}
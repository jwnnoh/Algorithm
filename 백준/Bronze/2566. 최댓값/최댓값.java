import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int[][] arr = new int[9][9];

        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int a = 0, b = 0;
        int max = arr[0][0];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (max <= arr[i][j]) {
                    max = arr[i][j];
                    a = i+1;
                    b = j+1;
                }
            }
        }

        bw.write(max + "\n");
        bw.write(a + " " + b + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String [][] arr = new String[5][15];

        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            for (int j = 0; j < 15; j++) {
                String[] s1 = s.split("");
                if (j >= s1.length) {
                    arr[i][j] = "";
                } else {
                    arr[i][j] = s1[j];
                    //j가 s1.length 넘어가는거 해결
                }
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                bw.write(arr[j][i]);
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
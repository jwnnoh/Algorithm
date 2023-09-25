import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int[][] arr = new int[h][w];

        for (int i = 0; i < h; i++) {
            String s = br.readLine();
            for (int j = 0; j < w; j++) {
                if (s.charAt(j) == 'c') {
                    arr[i][j] = 0;
                } else {
                    arr[i][j] = -1;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < h; i++) {
            int cnt = 0;
            boolean b = false;
            for (int j = 0; j < w; j++) {
                if (arr[i][j] == 0) {
                    if (b) {
                        cnt = 0;
                    }
                    else {
                        b = true;
                    }
                }
                if (b) {
                    arr[i][j] = cnt;
                    cnt++;
                }
            }
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                sb.append(arr[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

}
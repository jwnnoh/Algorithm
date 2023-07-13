import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        if (n != 1) {
            int[] arrx = new int[n];
            int[] arry = new int[n];
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                arrx[i] = Integer.parseInt(st.nextToken());
                arry[i] = Integer.parseInt(st.nextToken());
            }
            int maxx= arrx[0], minx = arrx[0];
            int maxy = arry[0], miny = arry[0];
            for (int i = 1; i < n; i++) {
                if (arrx[i] > maxx) {
                    maxx = arrx[i];
                } else if (arrx[i] < minx) {
                    minx = arrx[i];
                }
                if (arry[i] > maxy) {
                    maxy = arry[i];
                } else if (arry[i] < miny) {
                    miny = arry[i];
                }
            }
            int total = (maxx - minx) * (maxy - miny);
            bw.write(total + "\n");
        } else {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            bw.write(0 + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
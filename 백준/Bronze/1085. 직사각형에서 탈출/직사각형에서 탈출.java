import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int minx = 0;
        if (x > (w - x)) {
            minx = w - x;
        } else {
            minx = x;
        }

        int miny = 0;
        if (y > (h - y)) {
            miny = h-y;
        } else {
            miny = y;
        }

        if (minx > miny) {
            bw.write(miny + "\n");
        } else {
            bw.write(minx + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
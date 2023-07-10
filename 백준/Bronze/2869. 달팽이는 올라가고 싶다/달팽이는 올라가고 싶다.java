import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        int day = a-b;
        int dest = v -b;

        if (dest % day == 0) {
            bw.write(dest / day + "\n");
        } else {
            bw.write(dest / day + 1 + "\n");
        }

        bw.flush();
        br.close();
        bw.close();

    }
}
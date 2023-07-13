import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] c1 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        st = new StringTokenizer(br.readLine());
        int[] c2 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        st = new StringTokenizer(br.readLine());
        int[] c3 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};

        int x = 0;
        int y = 0;

        if (c1[0] == c2[0]) {
            x = c3[0];
        } else if (c2[0] == c3[0]) {
            x = c1[0];
        } else {
            x = c2[0];
        }

        if (c1[1] == c2[1]) {
            y = c3[1];
        } else if (c2[1] == c3[1]) {
            y = c1[1];
        } else {
            y = c2[1];
        }

        bw.write(x + " " + y + "\n");
        
        bw.flush();
        br.close();
        bw.close();
    }
}
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();
        String b = st.nextToken();

        String a1 = "";
        String b1 = "";

        for (int i = 2; i >= 0; i--) {
            a1 = a1 + a.charAt(i);
        }

        for (int i = 2; i >= 0; i--) {
            b1 = b1 + b.charAt(i);
        }

        String max = (Integer.parseInt(a1) > Integer.parseInt(b1)) ? a1 : b1;
        bw.write(max + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}
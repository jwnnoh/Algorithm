import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 1;
        String s;
        while ((s = br.readLine()) != null) {
            bw.write(s + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String s = br.readLine();

        for (char i = 'a'; i <= 'z'; i++) {
            bw.write(s.indexOf(i) + " ");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
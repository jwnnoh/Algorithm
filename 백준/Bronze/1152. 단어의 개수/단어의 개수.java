import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 0;
        String s = (br.readLine().trim());
        for (int i = 0; i < s.length(); i++) {
            String m = " ";
            if (String.valueOf(s.charAt(i)).isBlank()) {
                count++;
            }
        }
        if (s.isBlank()) {
            bw.write((count) + "\n");
        } else {
            bw.write((count+1) + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
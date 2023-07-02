import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(bf.readLine());

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= (a - i); j++) {
                bw.write(" ");
            }
            for (int k = 0; k < i; k++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        bf.close();

        bw.flush();
        bw.close();
    }
}
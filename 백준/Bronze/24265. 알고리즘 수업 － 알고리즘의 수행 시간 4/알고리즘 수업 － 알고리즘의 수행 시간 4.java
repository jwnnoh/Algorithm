import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Long n = Long.parseLong(br.readLine());

        bw.write(n*(n-1)/2 + "\n");
        bw.write(2 + "\n");


        bw.flush();
        br.close();
        bw.close();
    }
}
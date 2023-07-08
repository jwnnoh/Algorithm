import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());

        int solution = 0;
        int tmp = 1;
        for (int i = n.length()-1; i >=0; i--) {
            char c = n.charAt(i);
            if ('A' <= c && c <= 'Z') {
                solution += (c - 'A' + 10)*tmp;
            } else {
                solution += (c-'0')*tmp;
            }
            tmp *= b;
        }

        bw.write(solution + "\n");


        bw.flush();
        br.close();
        bw.close();
    }
}
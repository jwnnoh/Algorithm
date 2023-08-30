import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static StringBuilder sb;

    static int length;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s;
        while ((s = br.readLine()) != null) {
            int n = Integer.parseInt(s);

            length = (int) Math.pow(3, n);
            sb = new StringBuilder();

            sb.append("-".repeat(length));
            solution(0, length);
            System.out.println(sb);
        }

    }

    public static void solution(int start, int length) {
        if (length < 3) {
            return;
        }

        length /= 3;
        sb.replace(start+length, start+length*2, " ".repeat(length));

        solution(start, length);
        solution(start+length*2, length);
    }

}
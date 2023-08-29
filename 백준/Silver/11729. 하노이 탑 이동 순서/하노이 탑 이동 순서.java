import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    int count = 0;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        sb.append((int)Math.pow(2, n) - 1).append("\n");
        solution(n, 1, 2, 3);
        System.out.println(sb);
    }

    public static void solution(int n, int x, int y, int z) {
        if (n == 1) {
            sb.append(x + " " + z).append("\n");
        }
        else {
            solution(n-1, x, z, y);
            sb.append(x + " " + z).append("\n");
            solution(n-1, y, x, z);
        }
    }

}
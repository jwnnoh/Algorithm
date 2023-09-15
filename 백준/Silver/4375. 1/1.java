import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String s;
        int cnt;
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            cnt = 0;

            for (int i = 1;; i++) {
                cnt = ((cnt * 10) + 1) % n;

                if (cnt == 0) {
                    sb.append(i).append("\n");
                    break;
                }

            }
        }
        System.out.println(sb);
    }
}
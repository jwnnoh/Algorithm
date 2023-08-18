import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static long prime(long value) {
        boolean b = true;
        if (value == 0 || value == 1) {
            return 2;
        }
        for (long i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                b = false;
                break;
            }
        }
        if (!b) {
            value++;
            return prime(value);
        }
        else {
            return value;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            long value = Long.parseLong(br.readLine());
            sb.append(prime(value)).append("\n");
        }
        System.out.println(sb);
    }
}
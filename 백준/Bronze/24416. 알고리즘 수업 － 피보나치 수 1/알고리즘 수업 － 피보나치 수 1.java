import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static int[] f;

    public static int rCount = 1;
    public static int dpCount = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        f = new int[n+1];

        fib(n);
        fibonacci(n);

        System.out.println(rCount + " " + dpCount);

    }

    public static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            rCount++;
            return fib(n - 1) + fib(n - 2);

        }
    }

    public static int fibonacci(int n) {
        f[1] = f[2] = 1;
        for (int i = 3; i < n; i++) {
            dpCount++;
            f[i] = f[i - 1] + f[i - 2];
        }

        return f[n];
    }

}
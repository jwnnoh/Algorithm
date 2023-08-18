import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        int GCD = 0;
        for (int i = 0; i < list.size()-1; i++) {
            int distance = list.get(i + 1) - list.get(i);
            GCD = gcd(distance, GCD);
        }

        System.out.println((list.get(n - 1) - list.get(0)) / GCD - n + 1);
    }
}
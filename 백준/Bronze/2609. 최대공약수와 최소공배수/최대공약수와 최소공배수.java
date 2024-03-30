import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int gcd = getGcd(n, m);
        int lcm = getLcm(n, m, gcd);

        System.out.println(gcd);
        System.out.println(lcm);
    }

    private static int getLcm(int n, int m, int gcd) {
        return (n * m) / gcd;
    }

    private static int getGcd(int n, int m) {
        if (m == 0) {
            return n;
        }
        return getGcd(m, n % m);
    }
}
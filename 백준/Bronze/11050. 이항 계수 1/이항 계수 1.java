import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int loop = k;

        int n1 = 1;
        int k1 = 1;
        for (int i = 0; i < loop; i++) {
            n1 *= n;
            k1 *= k;
            n--;
            k--;
        }

        System.out.println(n1/k1);
    }
}
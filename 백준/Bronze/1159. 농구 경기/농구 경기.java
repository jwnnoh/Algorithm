import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();

    static String[] name;
    static int[] cnt = new int[26];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        name = new String[n];
        for (int i = 0; i < n; i++) {
            name[i] = br.readLine();
        }
        solve();

    }

    public static void solve() {
        for (String s :
                name) {
            cnt[s.charAt(0)-97]++;
        }
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] >= 5) {
                sb.append((char) (i + 97));
            }
        }
        if (sb.length() == 0) {
            System.out.println("PREDAJA");
        } else {
            System.out.println(sb);
        }
    }

}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];

        String s = br.readLine(); //65~90
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 65]++;
        }

        int flag = 0;
        for (int i :
                arr) {
            flag += i % 2;
        }

        if (flag > 1) {
            System.out.println("I'm Sorry Hansoo");
            System.exit(0);
        }

        StringBuilder mid = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                mid.append((char) (i + 65));
            }
        }

        StringBuilder pre = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]/2; j++) {
                pre.append((char) (i + 65));
            }
        }

        if (s.length() % 2 == 0) {
            sb.append(pre).append(pre.reverse());
            System.out.println(sb);
        } else {
            sb.append(pre).append(mid).append(pre.reverse());
            System.out.println(sb);
        }
    }

}
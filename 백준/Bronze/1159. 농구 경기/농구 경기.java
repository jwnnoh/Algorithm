import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] cnt = new int[26];

        for (int i = 0; i < n; i++) {
            cnt[br.readLine().charAt(0)-97]++;
        }

        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] >= 5) {
                sb.append((char) (i + 97));
            }
        }
        if (sb.length() == 0) {
            System.out.println("PREDAJA");
        }
        System.out.println(sb);


    }


}
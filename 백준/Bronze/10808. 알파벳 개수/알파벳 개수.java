import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        arr = new int[26];

        solve(br.readLine());
        System.out.println(sb);
    }

    public static void solve(String s) {
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)-97]++;
        }

        for (int i :
                arr) {
            sb.append(i).append(" ");
        }
        sb.append("\n");
    }

}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        solve(br.readLine());
        System.out.println(sb);

    }

    public static void solve(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90) { //대문자
                if (s.charAt(i) >= 78) {
                    sb.append((char) (s.charAt(i) - 13));
                } else {
                    sb.append((char) (s.charAt(i) + 13));
                }
            } else if (s.charAt(i) >= 97 && s.charAt(i) <= 122) { //소문자
                if (s.charAt(i) >= 110) {
                    sb.append((char) (s.charAt(i) - 13));
                } else {
                    sb.append((char) (s.charAt(i) + 13));
                }
            } else {
                sb.append(s.charAt(i));
            }
        }
    }


}
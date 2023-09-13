import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static String pattern;
    static int flag;
    static boolean b = false;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        pattern = br.readLine();
        flag = pattern.indexOf("*");
        String pre = pattern.substring(0, flag);
        String suf = pattern.substring(flag+1);

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if (pre.length()+suf.length() > s.length()) {
                sb.append("NE").append("\n");
            }
            else if (s.startsWith(pre) && s.endsWith(suf)) {
                sb.append("DA").append("\n");
            }
            else {
                sb.append("NE").append("\n");
            }
        }

        System.out.println(sb);
    }

}
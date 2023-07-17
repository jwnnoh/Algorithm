import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s;
        int[] arr = new int[26];

        while ((s = br.readLine()) != null) {
            s = s.replaceAll(" ", "");
            for (int i = 0; i < s.length(); i++) {
                int tmp = ((int)s.charAt(i));
                arr[tmp-97]++;
            }
        }

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                bw.write((char)(i+97));
            }
        }
        bw.write("\n");

        bw.flush();
        br.close();
        bw.close();
    }
}


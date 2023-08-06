import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;

        String s = br.readLine();
        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            hashSet.add(String.valueOf(s.charAt(i)));
        }

        int start = 0;
        while (start != s.length() - 1) {
            for (int i = start; i < s.length(); i++) {
                for (int j = start+1; j < s.length(); j++) {
                    hashSet.add(s.substring(i, j+1));
                    if (j == s.length() - 1) {
                        start++;
                    }
                }
            }
        }
        System.out.println(hashSet.size());
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static int groupCheck(String s) {
        boolean b = false;
        HashSet<Character> hashSet = new HashSet<>();
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                if (hashSet.contains(s.charAt(i+1))) {
                    b = true;
                    break;
                } else {
                    hashSet.add(s.charAt(i));
                }
            }
        }

        if (!b) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int count = 0;
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            count += groupCheck(s);
        }
        System.out.println(count);
    }
}
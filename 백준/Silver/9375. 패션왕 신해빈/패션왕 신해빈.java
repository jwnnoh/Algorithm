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
        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(br.readLine());
            HashMap<String, Integer> hashMap = new HashMap<>(k);

            for (int j = 0; j < k; j++) {
                String s = br.readLine();
                s = s.substring(s.indexOf(" "));

                if (hashMap.containsKey(s)) {
                    hashMap.put(s, hashMap.get(s)+1);
                } else {
                    hashMap.put(s, 1);
                }
            }
            int sum = 1;
            for (int j :
                    hashMap.values()) {
                sum *= j+1;
            }
            sb.append(sum - 1).append("\n");
        }
        System.out.println(sb);
    }

}
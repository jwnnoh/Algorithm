import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashSet<String> hashSet = new HashSet<>();
        String[] checkSet = new String[m];

        for (int i = 0; i < n; i++) {
            hashSet.add(br.readLine());
        }
        for (int i = 0; i < m; i++) {
            checkSet[i] = br.readLine();
        }

        int count = 0;
        for (String s : checkSet) {
            if (hashSet.contains(s)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
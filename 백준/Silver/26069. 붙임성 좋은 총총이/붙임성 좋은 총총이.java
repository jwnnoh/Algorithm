import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("ChongChong");

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();

            if (hashSet.contains(a)) {
                hashSet.add(b);
            } else if (hashSet.contains(b)) {
                hashSet.add(a);
            }
        }
        System.out.println(hashSet.size());
    }
}
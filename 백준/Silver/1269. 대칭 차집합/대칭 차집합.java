import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashSet<Integer> a = new HashSet<>();
        HashSet<Integer> b = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            b.add(Integer.parseInt(st.nextToken()));
        }

        HashSet<Integer> ans = new HashSet<>();

        int count = 0;
        for (int i : a) {
            if (!b.contains(i)) {
                count++;
            }
        }
        for (int i : b) {
            if (!a.contains(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
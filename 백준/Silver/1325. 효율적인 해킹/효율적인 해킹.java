import java.io.*;
import java.util.*;

public class Main {

    static int n, m;
    static boolean[] check;
    static int[] count;
    static ArrayList<Integer>[] arrayLists;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        count = new int[n + 1];
        check = new boolean[n + 1];

        arrayLists = new ArrayList[n+1];
        for (int i = 0; i < n; i++) {
            arrayLists[i + 1] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arrayLists[a].add(b);
        }

        int max = -1;
        for (int i = 0; i < n; i++) {
            check = new boolean[n + 1];
            dfs(i+1);
        }

        for (int i :
                count) {
            max = Math.max(max, i);
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] == max) {
                sb.append(i).append(" ");
            }
        }
        System.out.println(sb);

    }

    public static void dfs(int com) {
        check[com] = true;
        for (int i :
                arrayLists[com]) {
            if (check[i]) {
                continue;
            }
            count[i]++;
            dfs(i);
        }
    }

}
import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashSet<String> hashSet = new HashSet<>();
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <n; i++) {
            hashSet.add(br.readLine());
        }

        for (int i = 0; i < m; i++) {
            String name = br.readLine();
            if (hashSet.contains(name)) {
                ans.add(name);
            }
        }
        sb.append(ans.size()).append("\n");
        Collections.sort(ans);

        for (String s :
                ans) {
            sb.append(s).append("\n");
        }
        System.out.println(sb);
    }
}
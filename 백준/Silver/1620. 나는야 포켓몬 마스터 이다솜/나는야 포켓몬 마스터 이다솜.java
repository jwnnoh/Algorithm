import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<Integer, String> intHashMap = new HashMap<>();
        HashMap<String, Integer> stringHashMap = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            String name = br.readLine();
            intHashMap.put(i, name);
            stringHashMap.put(name, i);
        }


        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            if (s.charAt(0) >= 49 && s.charAt(0) <= 57) {
                sb.append(intHashMap.get(Integer.parseInt(s))).append("\n");
            } else {
                sb.append(stringHashMap.get(s)).append("\n");
            }
        }
        System.out.println(sb);
    }
}
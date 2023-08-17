import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if (s.length() >= m) {
                if (hashMap.containsKey(s)) {
                    hashMap.put(s, hashMap.get(s) + 1);
                } else {
                    hashMap.put(s, 1);
                }
            }
        }

        List<String> list = new ArrayList<>(hashMap.keySet());

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (hashMap.get(o2) - hashMap.get(o1) != 0) {
                    return hashMap.get(o2) - hashMap.get(o1);
                }
                if (o2.length() != o1.length()) {
                    return o2.length() - o1.length();
                } else {
                    return o1.compareTo(o2);
                }
            }
        });

        for (String s :
                list) {
            sb.append(s).append("\n");
        }
        System.out.println(sb);
    }
}
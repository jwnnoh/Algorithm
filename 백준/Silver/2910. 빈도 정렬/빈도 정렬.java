import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        HashMap<Integer, Integer> hashmap = new LinkedHashMap<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            if (!hashmap.containsKey(tmp)) {
                hashmap.put(tmp, 1);
            }
            else {
                hashmap.put(tmp, hashmap.get(tmp) + 1);
            }
        }

        ArrayList<Integer> arrayList = new ArrayList<>(hashmap.keySet());

        Collections.sort(arrayList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return hashmap.get(o2) - hashmap.get(o1);
            }
        });

        StringBuilder sb = new StringBuilder();
        Iterator<Integer> it = arrayList.iterator();
        while (it.hasNext()) {
            Integer tmp = it.next();
            for (int i = 0; i < hashmap.get(tmp); i++) {
                sb.append(tmp + " ");
            }
        }
        System.out.println(sb);
    }

}
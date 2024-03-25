import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n, mp, mf, ms, mv;
    static int price = Integer.MAX_VALUE;
    static Map<Integer, List<List<Integer>>> map = new HashMap<>();
    static List<List<Integer>> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;

        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        mp = Integer.parseInt(st.nextToken());
        mf = Integer.parseInt(st.nextToken());
        ms = Integer.parseInt(st.nextToken());
        mv = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                list.get(i).add(Integer.parseInt(st.nextToken()));
            }
        }

        for (int i = 1; i < (1 << n); i++) {
            int p = 0;
            int f = 0;
            int s = 0;
            int v = 0;
            int count = 0;
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    temp.add(j + 1);
                    p += list.get(j).get(0);
                    f += list.get(j).get(1);
                    s += list.get(j).get(2);
                    v += list.get(j).get(3);
                    count += list.get(j).get(4);
                }
            }
            if (p >= mp && f >= mf && s >= ms && v >= mv) {
                if (count <= price) {
                    price = count;
                    if (!map.containsKey(price)) {
                        map.put(price, new ArrayList<>());
                    }
                    if (map.containsKey(price)) {
                        map.get(price).add(new ArrayList<>(temp));
                    }
                }
            }
        }

        if (price == Integer.MAX_VALUE) {
            System.out.println(-1);
            return;
        }
        PriorityQueue<String> pq = new PriorityQueue<>();
        for (int i = 0; i < map.get(price).size(); i++) {
            sb = new StringBuilder();
            List<Integer> numbers = new ArrayList<>(map.get(price).get(i));
            for (int j : numbers) {
                sb.append(j).append(" ");
            }
            pq.add(String.valueOf(sb));
        }

        sb = new StringBuilder();
        sb.append(price).append("\n").append(pq.poll());
        System.out.println(sb);
    }
}
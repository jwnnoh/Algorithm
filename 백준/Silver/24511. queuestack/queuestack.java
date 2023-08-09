import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        boolean[] booleans = new boolean[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            if (Integer.parseInt(st.nextToken()) == 0) {
                booleans[i] = true;
            } else {
                booleans[i] = false;
            }
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int value = Integer.parseInt(st.nextToken());
            if (booleans[i]) {
                arrayList.add(value);
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = arrayList.size()-1; i >= 0; i--) {
            queue.offer(arrayList.get(i));
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            queue.offer(Integer.parseInt(st.nextToken()));
            sb.append(queue.poll()).append(" ");
        }

        System.out.println(sb);
    }
}
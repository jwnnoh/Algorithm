import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        sb.append("<");
        while (true) {
            for (int i = 1; i < k; i++) {
                int tmp = queue.poll();
                queue.offer(tmp);
            }
            if (queue.size() == 1) {
                sb.append(queue.poll()).append(">");
            } else {
                sb.append(queue.poll()).append(", ");
            }
            if (queue.isEmpty()) {
                System.out.println(sb);
                break;
            }
        }
    }
}
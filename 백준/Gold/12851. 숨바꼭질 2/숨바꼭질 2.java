import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int[] visited = new int[200001];
        int[] count = new int[200001];
        Queue<Integer> queue = new LinkedList<>();

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        if (n == k) {
            sb.append(0).append("\n");
            sb.append(1);
            System.out.println(sb);
            return;
        }

        visited[n] = 1;
        count[n] = 1;
        queue.add(n);

        while (!queue.isEmpty()) {
            int now = queue.poll();

            for (int next : new int[]{now - 1, now + 1, now * 2}) {
                if (next >= 0 && next <= 200000) {
                    if (visited[next] == 0) {
                        queue.add(next);
                        visited[next] = visited[now] + 1;
                        count[next] += count[now];
                        continue;
                    }
                    if (visited[next] == visited[now] + 1) {
                        count[next] += count[now];
                    }
                }

            }
        }

        sb.append(visited[k] - 1).append("\n");
        sb.append(count[k]);
        System.out.println(sb);
    }
}
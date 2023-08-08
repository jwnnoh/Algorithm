import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            deque.offer(i);
            arrayList.add(Integer.parseInt(st.nextToken()));
        }

        int count = 0;
        int value = 0;
        while (true) {
            if (count == 0) {
                value = deque.pollFirst();
                sb.append(value).append(" ");
                count++;
            }

            int move = arrayList.get(value - 1);

            if (move > 0) {
                for (int i = 0; i < move - 1; i++) {
                    deque.offer(deque.pollFirst());
                }
                value = deque.pollFirst();
                sb.append(value).append(" ");
            } else {
                move = -(move);
                for (int i = 0; i < move - 1; i++) {
                    deque.offerFirst(deque.pollLast());
                }
                value = deque.pollLast();
                sb.append(value).append(" ");
            }

            if (deque.isEmpty()) {
                System.out.println(sb);
                break;
            }
        }
    }
}
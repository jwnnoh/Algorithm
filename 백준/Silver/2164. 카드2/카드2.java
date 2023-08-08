import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        while (true) {
            if (queue.size() == 1) {
                System.out.println(1);
                break;
            }
            queue.poll();
            if (queue.size() == 1) {
                System.out.println(queue.peek());
                break;
            }
            int tmp = queue.poll();
            queue.add(tmp);
        }
    }
}
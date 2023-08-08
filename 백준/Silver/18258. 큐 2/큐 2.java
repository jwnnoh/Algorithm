import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();

        int value = 0;
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if (s.startsWith("push")) {
                value = Integer.parseInt(s.substring(5));
                queue.add(value);
            }
            switch (s) {
                case "pop":
                    if (queue.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(queue.poll()).append("\n");
                    }
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    if (queue.isEmpty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                case "front":
                    if (queue.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(queue.peek()).append("\n");
                    }
                    break;
                case "back":
                    if (queue.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(value).append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}
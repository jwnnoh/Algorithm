import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        Queue<Integer> origin = new LinkedList<>(){};
        Stack<Integer> sub = new Stack<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            origin.add(Integer.parseInt(st.nextToken()));
        }

        int count = 0;
        while (true) {
            int value = 0;
            if (!origin.isEmpty()) {
                value = origin.remove();
            }
            if (value == count + 1) {
                count++;
            }
            else {
                while (!sub.isEmpty() && sub.peek() == count + 1) {
                    sub.pop();
                    count++;
                }
                sub.add(value);
            }
            if (count == n) {
                break;
            } else if (origin.isEmpty() && sub.peek() != count + 1) {
                break;
            }
        }
        if (count == n) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }
}
import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());

        int input = 0;
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            int value = Integer.parseInt(String.valueOf(s.charAt(0)));

            if (value == 1) {
                input = Integer.parseInt(String.valueOf(s.substring(2)));
            }
            switch (value) {
                case 1:
                    stack.push(input);
                    break;
                case 2:
                    if (stack.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(stack.lastElement()).append("\n");
                        stack.pop();
                    }
                    break;
                case 3:
                    sb.append(stack.size()).append("\n");
                    break;
                case 4:
                    if (stack.isEmpty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                case 5:
                    if (stack.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(stack.lastElement()).append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}
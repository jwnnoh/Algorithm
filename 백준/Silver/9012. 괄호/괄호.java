import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c == '(') {
                    stack.push(c);
                }
                else {
                    if(stack.isEmpty()) {
                        stack.push(c);
                        break;
                    }
                    else {
                        stack.pop();
                    }
                }
            }
            if (stack.isEmpty()) {
                sb.append("YES").append("\n");
            } else {
                sb.append("NO").append("\n");
            }
            stack.clear();
        }
        System.out.println(sb);
    }
}
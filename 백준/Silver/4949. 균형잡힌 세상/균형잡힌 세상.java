import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Character> stack = new Stack<>();
        while (true) {
            String s = br.readLine();
            if (s.equals(".")) {
                break;
            }
            for (int i = 0; i < s.length(); i++) {
                Character c = s.charAt(i);
                switch (c) {
                    case '(':
                    case '[':
                        stack.push(c);
                        break;
                    case ')':
                        if (stack.isEmpty()) {
                            stack.push(c);
                            i = s.length() - 1;
                            break;
                        } else if (stack.peek().equals('(')) {
                            stack.pop();
                        } else {
                            i = s.length() - 1;
                        }
                        break;
                    case ']':
                        if (stack.isEmpty()) {
                            stack.push(c);
                            i = s.length() - 1;
                            break;
                        } else if (stack.peek().equals('[')) {
                            stack.pop();
                        } else {
                            i = s.length() - 1;
                        }
                        break;
                }
            }

            if (stack.isEmpty()) {
                sb.append("yes").append("\n");
            } else {
                sb.append("no").append("\n");
            }
            stack.clear();
        }
        System.out.println(sb);
    }
}
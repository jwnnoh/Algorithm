import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Character> stack = new Stack<>();

        int count = 0;
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String s = br.readLine();

            for (int j = 0; j < s.length(); j++) {
                if (stack.isEmpty()) {
                    stack.push(s.charAt(j));
                }
                else {
                    if (stack.peek() == s.charAt(j)) {
                        stack.pop();
                    }
                    else {
                        stack.push(s.charAt(j));
                    }
                }
            }
            if (stack.isEmpty()) {
                count++;
            }
            stack.clear();
        }
        System.out.println(count);
    }
}
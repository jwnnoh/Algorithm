import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            int value = Integer.parseInt(br.readLine());

            if (value == 0) {
                stack.pop();
            } else {
                stack.push(value);
            }
        }

        int count = 0;
        for (int i :
                stack) {
            count += i;
        }
        System.out.println(count);
    }
}
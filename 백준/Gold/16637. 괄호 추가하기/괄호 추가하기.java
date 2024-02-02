import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static List<Integer> num = new ArrayList<>();
    static List<Character> operator = new ArrayList<>();
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                num.add(Integer.parseInt(String.valueOf(s.charAt(i))));
                continue;
            }
            operator.add(s.charAt(i));
        }

        solve(0, num.get(0));
        System.out.println(max);
    }

    public static void solve(int idx, int number) {
        if (idx == num.size() - 1) {
            max = Math.max(max, number);
            return;
        }

        int result = math(operator.get(idx), number, num.get(idx + 1));
        solve(idx + 1, result);

        if (idx + 2 <= num.size() - 1) {
            int tmp = math(operator.get(idx + 1), num.get(idx + 1), num.get(idx + 2));
            solve(idx + 2, math(operator.get(idx), number, tmp));
        }
    }

    public static int math(char operator, int a, int b) {
        switch (operator) {
            case '+' -> {
                return a + b;
            }
            case '-' -> {
                return a - b;
            }
            case '*' -> {
                return a * b;
            }
        }
        return 1;
    }

}
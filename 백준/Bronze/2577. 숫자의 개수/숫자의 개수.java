import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] arr;

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int value = 1;
        int[] arr = new int[10];
        for (int i = 0; i < 3; i++) {
            value *= Integer.parseInt(br.readLine());
        }

        while (value != 0) {
            arr[value % 10]++;
            value /= 10;
        }

        for (int i : arr) {
            sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n + 1];

        arr[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            arr[i] = 5;
        }

        for (int i = 2; i < n + 1; i++) {
            for (int j = 0; j * j <= i; j++) {
                arr[i] = Math.min(arr[i], arr[i - j * j] + 1);
            }
        }
        System.out.println(arr[n]);
    }
}
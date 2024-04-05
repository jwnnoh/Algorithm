import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        arr = new int[n + 1];
        Arrays.fill(arr, -1);

        arr[0] = 0;
        arr[1] = 0;

        System.out.println(go(n));
    }

    private static int go(int n) {

        if (arr[n] == -1) {
            if (n % 6 == 0) {
                arr[n] = Math.min(go(n - 1), Math.min(go(n / 3), go(n / 2))) + 1;
            }
            else if (n % 3 == 0) {
                arr[n] = Math.min(go(n / 3), go(n - 1)) + 1;
            }
            else if (n % 2 == 0) {
                arr[n] = Math.min(go(n / 2), go(n - 1)) + 1;
            }
            else {
                arr[n] = go(n -1) + 1;
            }
        }
        return arr[n];
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(go(k, numbers));
    }

    private static int go(int k, int[] numbers) {
        arr = new int[k + 1];
        arr[0] = 1;

        for (int num : numbers) { // 1
            for (int i = num; i <= k; i++) { // 2
                arr[i] += arr[i - num]; // 3
            }
        }
        return arr[k]; // 4
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[][] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        arr = new int[41][2];
        arr[0][0] = 1;
        arr[0][1] = 0;
        arr[1][0] = 0;
        arr[1][1] = 1;

        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            int[] temp = fibonacci(m);

            sb.append(temp[0]).append(" ").append(temp[1]).append("\n");
        }
        System.out.println(sb);
    }

    private static int[] fibonacci(int m) {
        if (arr[m][0] == 0 && arr[m][1] == 0) {
            arr[m][0] = fibonacci(m - 1)[0] + fibonacci(m - 2)[0];
            arr[m][1] = fibonacci(m - 1)[1] + fibonacci(m - 2)[1];
        }

        return arr[m];
    }
}
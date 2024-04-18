import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int start = arr[0];

        if (start == 8) {
            for (int i = 1; i < 8; i++) {
                if (arr[i] != arr[i - 1] - 1) {
                    System.out.println("mixed");
                    return;
                }
            }
            System.out.println("descending");
            return;
        }
        if (start == 1) {
            for (int i = 1; i < 8; i++) {
                if (arr[i] != arr[i - 1] + 1) {
                    System.out.println("mixed");
                    return;
                }
            }
            System.out.println("ascending");
            return;
        }
        System.out.println("mixed");
    }
}
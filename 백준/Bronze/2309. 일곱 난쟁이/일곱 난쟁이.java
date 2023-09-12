import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[9];
        int count = 0;
        boolean b = false;

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            count += arr[i];
        }

        Arrays.sort(arr);

        for (int i = 0; i < 8; i++) {
            for (int j = i+1; j < 9; j++) {
                if (arr[i] + arr[j] == count - 100) {
                    b = true;
                    arr[i] = arr[j] = 0;
                    break;
                }
            }
            if (b) {
                break;
            }

        }
        Arrays.sort(arr);

        for (int i = 2; i < 9; i++) {
            sb.append(arr[i]).append("\n");
        }

        System.out.println(sb);

    }


}
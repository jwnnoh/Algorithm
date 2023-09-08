import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static int[] arr = new int[1000001];


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i < 3; i++) {
            arr[i] = i;
        }

        System.out.println(solution(n));
    }

    public static int solution(int n) {
        if (arr[n] != 0) {
            return arr[n];
        }
        else {
            arr[n] = (solution(n - 1) + solution(n - 2)) %15746;
        }
        return arr[n];
    }

}